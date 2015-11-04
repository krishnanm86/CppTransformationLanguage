package de.sepl.cs.unifrankfurt.ttlparser;

import de.sepl.cs.unifrankfurt.ttlparser.TTLParser.SpecContext;
import de.sepl.cs.unifrankfurt.ttlparser.TTLParser.TransformationProgramContext;

public class AntlrTTLListener extends TTLBaseListener {

	
	


	@Override
	public void enterTransformationProgram(TransformationProgramContext ctx) {
		for(SpecContext spec : ctx.spec())
		{
			System.out.println("Spec");
			System.out.println(spec.getText());
		}
	}
 
}