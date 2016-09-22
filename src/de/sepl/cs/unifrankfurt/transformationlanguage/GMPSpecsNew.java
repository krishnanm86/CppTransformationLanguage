package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class GMPSpecsNew {

	public static Set<TTlRule> populateRules() throws Exception {

		Set<TTlRule> rules = new HashSet<TTlRule>();

		TTlExpression rulePattern29 = new TTlExpression("int* __ttlname__ = (int*)malloc(sizeof(int)*__ttlp__);",
				NodeType.Declaration);
		TTlExpression ruleConstructExpression29 = new TTlExpression(
				"mpz_t* __ttlname__ = (mpz_t*)malloc(sizeof(mpz_t)*__ttlp__);", NodeType.Declaration);
		rules.add(new TTlRule(rulePattern29, ruleConstructExpression29, NodeType.Declaration,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern11 = new TTlExpression("__ttlp__ = __ttlp2__ % __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression11 = new TTlExpression("mpz_mod_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern11, ruleConstructExpression11, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern30 = new TTlExpression("(__ttlp__ - 0) >= 0", NodeType.Expression);
		TTlExpression ruleConstructExpression30 = new TTlExpression("mpz_cmp_ui(__ttlp__, 0) >= 0",
				NodeType.Expression);
		rules.add(new TTlRule(rulePattern30, ruleConstructExpression30, NodeType.Expression,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern31 = new TTlExpression("(__ttlp__ - __ttlp2__) > 0", NodeType.Statement);
		TTlExpression ruleConstructExpression31 = new TTlExpression("mpz_cmp(__ttlp__,__ttlp2__) > 0",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern31, ruleConstructExpression31, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern32 = new TTlExpression("__ttlname__ = (int*) malloc(sizeof(int));",
				NodeType.Statement);
		TTlExpression ruleConstructExpression32 = new TTlExpression("__ttlname__ = (mpz_t*) malloc(sizeof(mpz_t));",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern32, ruleConstructExpression32, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern33 = new TTlExpression("__ttlname__ = (int*) realloc(sizeof(int));",
				NodeType.Statement);
		TTlExpression ruleConstructExpression33 = new TTlExpression("__ttlname__ = (mpz_t*) realloc(sizeof(mpz_t));",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern33, ruleConstructExpression33, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern34 = new TTlExpression("__ttlname__ = 0;", NodeType.Statement);
		TTlExpression ruleConstructExpression34 = new TTlExpression("mpz_init_set_ui(__ttlname__, 0);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern34, ruleConstructExpression34, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern35 = new TTlExpression("__ttlname__ = 0;", NodeType.Statement);
		TTlExpression ruleConstructExpression35 = new TTlExpression("mpz_init(__ttlname__, 0);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern35, ruleConstructExpression35, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern2 = new TTlExpression("__ttlp__ = __ttlp2__ + 1;", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression("mpz_add_ui(__ttlp__,__ttlp2__,1);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern2, ruleConstructExpression2, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern3 = new TTlExpression("__ttlp__ = __ttlp2__ + 2;", NodeType.Statement);
		TTlExpression ruleConstructExpression3 = new TTlExpression("mpz_add_ui(__ttlp__,__ttlp2__,2);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern3, ruleConstructExpression3, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern4 = new TTlExpression("__ttlp__ = __ttlp2__ + __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression4 = new TTlExpression("mpz_add(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern4, ruleConstructExpression4, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern16 = new TTlExpression("__ttlp__ = __ttlp2__ * __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression16 = new TTlExpression("mpz_mul(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern16, ruleConstructExpression16, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern36 = new TTlExpression("(__ttlp__ - __ttlp2__) == 0", NodeType.Statement);
		TTlExpression ruleConstructExpression36 = new TTlExpression("mpz_cmp(__ttlp__,__ttlp2__) == 0",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern36, ruleConstructExpression36, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern25 = new TTlExpression("__ttlp__ = __ttlp2__ ;", NodeType.Statement);
		TTlExpression ruleConstructExpression25 = new TTlExpression("mpz_init_set(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern25, ruleConstructExpression25, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern37 = new TTlExpression("free(__ttlname__);", NodeType.Statement);
		TTlExpression ruleConstructExpression37 = new TTlExpression("mpz_clear(__ttlname__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern37, ruleConstructExpression37, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		return rules;
	}

	public static Set<TTlRule> populateRules2() throws Exception {

		Set<TTlRule> rules = new HashSet<TTlRule>();

		// No Transform rules

		TTlExpression rulePattern38 = new TTlExpression("i __ttlop__ __ttlhole__;", NodeType.Statement);
		TTlExpression ruleConstructExpression38 = new TTlExpression("i __ttlop__ __ttlhole__;", NodeType.Statement);
		rules.add(new TTlRule(rulePattern38, ruleConstructExpression38, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern39 = new TTlExpression("j __ttlop__ __ttlhole__;", NodeType.Statement);
		TTlExpression ruleConstructExpression39 = new TTlExpression("j __ttlop__ __ttlhole__;", NodeType.Statement);
		rules.add(new TTlRule(rulePattern39, ruleConstructExpression39, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		
		TTlExpression rulePattern40 = new TTlExpression("while __ttlhole__", NodeType.Statement);
		TTlExpression ruleConstructExpression40 = new TTlExpression("while __ttlhole__", NodeType.Statement);
		rules.add(new TTlRule(rulePattern39, ruleConstructExpression39, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		
		
		//Normal rules

		/*
		 * TTlExpression rulePattern0 = new TTlExpression("int *__ttlp__",
		 * NodeType.Declaration); TTlExpression ruleConstructExpression0 = new
		 * TTlExpression("mpz_t *__ttlp__", NodeType.Declaration); rules.add(new
		 * TTlRule(rulePattern0, ruleConstructExpression0, NodeType.Declaration,
		 * new HashMap<Scope, String>(), new HashMap<Tag, String>()));
		 */

		TTlExpression rulePattern1 = new TTlExpression("int __ttlp__;", NodeType.Statement);
		TTlExpression ruleConstructExpression1 = new TTlExpression("mpz_t __ttlp__; mpz_init(__ttlp__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern1, ruleConstructExpression1, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern2 = new TTlExpression("__ttlp__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression("mpz_set(__ttlp__,__ttlp2__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern2, ruleConstructExpression2, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern31 = new TTlExpression("__ttlp1__ > __ttlp2__", NodeType.Expression);
		TTlExpression ruleConstructExpression31 = new TTlExpression("mpz_cmp(__ttlp1__,__ttlp2__)",
				NodeType.Expression);
		rules.add(new TTlRule(rulePattern31, ruleConstructExpression31, NodeType.Expression,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		return rules;
	}
}