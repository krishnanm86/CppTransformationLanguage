package de.sepl.cs.unifrankfurt.transformationlanguage;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class TTLTest {

	public static void main(String[] args) throws Exception {
		TTlExpression ttlPattern = new TTlExpression("for(int i = 0 ; i < 10; i++ ) {__ttla();}", NodeType.Statement);
		TTlExpression ttlFragmentToMatch = new TTlExpression("for(int i = 0 ; i < 10; i++ ) {fna();}",
				NodeType.Statement);
		TTLUtils.printHoleMap(TTLUtils.match(ttlPattern, ttlFragmentToMatch));
	}

}
