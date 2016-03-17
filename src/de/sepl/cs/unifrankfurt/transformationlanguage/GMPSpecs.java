package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class GMPSpecs {

	public static Set<TTlRule> populateRules() throws Exception {
		Set<TTlRule> rules = new HashSet<TTlRule>();

		TTlExpression intDeclarationPattern = new TTlExpression("int __ttlvarname__ = __ttlconst__;",
				NodeType.Statement);
		TTlExpression intDeclarationConstructExpression = new TTlExpression(
				"mpz_t __ttlvarname__; mpz_init_ui(__ttlvarname__,__ttlconst__);", NodeType.Statement);
		rules.add(new TTlRule(intDeclarationPattern, intDeclarationConstructExpression, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression mulDeclarationPattern = new TTlExpression("__ttlp__ = __ttlp2__ * __ttlp3__;",
				NodeType.Statement);
		TTlExpression mulDeclarationConstructExpression = new TTlExpression("mpz_mul_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(mulDeclarationPattern, mulDeclarationConstructExpression, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		return rules;
	}
}
