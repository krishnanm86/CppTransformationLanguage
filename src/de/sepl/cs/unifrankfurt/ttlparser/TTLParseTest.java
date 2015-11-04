package de.sepl.cs.unifrankfurt.ttlparser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.sepl.cs.unifrankfurt.ttlparser.TTLParser.TransformationProgramContext;

public class TTLParseTest {

	public static void main(String[] args) throws IOException {
		printTTL(readFile("example.ttl", Charset.defaultCharset()));
	}

	private static void printTTL(String ttlProgram) {
		// Get our lexer
		TTLLexer lexer = new TTLLexer(new ANTLRInputStream(ttlProgram));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		TTLParser parser = new TTLParser(tokens);

		// Specify our entry point
		TransformationProgramContext transformationProgramContext = parser.transformationProgram();

		// Walk it and attach our listener
		ParseTreeWalker walker = new ParseTreeWalker();
		AntlrTTLListener listener = new AntlrTTLListener();
		walker.walk(listener, transformationProgramContext);
	}

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
}
