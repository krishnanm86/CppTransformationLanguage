package de.sepl.cs.unifrankfurt.ttlparserlexerrunner;

import de.sepl.cs.unifrankfurt.ttlparserlexer.TTLBaseListener;
import de.sepl.cs.unifrankfurt.ttlparserlexer.TTLParser;
import de.sepl.cs.unifrankfurt.ttlparserlexer.TTLParser.DeclContext;
import de.sepl.cs.unifrankfurt.ttlparserlexer.TTLParser.MapdeclContext;
import de.sepl.cs.unifrankfurt.ttlparserlexer.TTLParser.SpecContext;
import de.sepl.cs.unifrankfurt.ttlparserlexer.TTLParser.TransformationProgramContext;
import de.sepl.cs.unifrankfurt.ttlparserlexer.TTLParser.TransformationruleContext;

public class AntlrTTLListener extends TTLBaseListener {

	@Override
	public void enterTransformationProgram(TransformationProgramContext ctx) {
	/*	for (SpecContext spec : ctx.spec()) {
			for(DeclContext decl : spec.decl())
			{
				System.out.println("Decl");
				System.out.println(decl.getText());
			}
			System.out.println("Spec");
			System.out.println(spec.getText());
		}*/
	}

	@Override
	public void enterTransformationrule(TransformationruleContext ctx) {
		//System.out.println("RUle " + ctx.getText() );

	}

	
}
