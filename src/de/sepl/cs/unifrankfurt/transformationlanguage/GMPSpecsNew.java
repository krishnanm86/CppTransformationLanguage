package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class GMPSpecsNew {

	public static Set<TTlRule> populateRules() throws Exception {
		Set<TTlRule> rules = new LinkedHashSet<TTlRule>();

		addNoTransformRules(rules);
		
		
		TTlExpression rulePattern1 = new TTlExpression("int* __ttlname__ = (int*) malloc(sizeof(int) * __ttlp__);",
				NodeType.Statement);
		TTlExpression ruleConstructExpression1 = new TTlExpression(
				"mpz_t* __ttlname__ = (mpz_t*)malloc(sizeof(mpz_t)*__ttlp__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern1, ruleConstructExpression1, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern1_3 = new TTlExpression("__ttlname__ = (int*) malloc(sizeof(int));",
				NodeType.Statement);
		TTlExpression ruleConstructExpression1_3 = new TTlExpression("__ttlname__ = (mpz_t*) malloc(sizeof(mpz_t));",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern1_3, ruleConstructExpression1_3, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern1_2 = new TTlExpression(
				"__ttlname__ = (int*) realloc(__ttlp1__, sizeof(int) * __ttlp__);", NodeType.Statement);
		TTlExpression ruleConstructExpression1_2 = new TTlExpression(
				"__ttlname__ = (mpz_t*)realloc(__ttlp1__, sizeof(mpz_t)*__ttlp__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern1_2, ruleConstructExpression1_2, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern0 = new TTlExpression("int* __ttlname__", NodeType.Expression);
		TTlExpression ruleConstructExpression0 = new TTlExpression("mpz_t* __ttlname__", NodeType.Expression);
		rules.add(new TTlRule(rulePattern0, ruleConstructExpression0, NodeType.Expression, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern0_1 = new TTlExpression("int __ttlname__", NodeType.Expression);
		TTlExpression ruleConstructExpression0_1 = new TTlExpression("mpz_t __ttlname__", NodeType.Expression);
		rules.add(new TTlRule(rulePattern0_1, ruleConstructExpression0_1, NodeType.Expression,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern2 = new TTlExpression("__ttlp__ = __ttlp2__ % __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression("mpz_mod(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern2, ruleConstructExpression2, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern3_1 = new TTlExpression("(__ttlp__ - 0) __ttlop__ 0", NodeType.Expression);
		TTlExpression ruleConstructExpression3_1 = new TTlExpression(
				"mpz_cmp_ui(__ttlp__,__ttlp2__) __ttlop__ 0", NodeType.Expression);
		rules.add(new TTlRule(rulePattern3_1, ruleConstructExpression3_1, NodeType.Expression,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern3 = new TTlExpression("assert((__ttlp__ - __ttlp2__) __ttlop__ 0);",
				NodeType.Statement);
		TTlExpression ruleConstructExpression3 = new TTlExpression("assert(mpz_cmp(__ttlp__,__ttlp2__) __ttlop__ 0);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern3, ruleConstructExpression3, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern4 = new TTlExpression("__ttlp__ = 0;", NodeType.Statement);
		TTlExpression ruleConstructExpression4 = new TTlExpression("mpz_init_set_ui(__ttlp__, 0);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern4, ruleConstructExpression4, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern5_1 = new TTlExpression("__ttlp__->__ttlp1__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression5_1 = new TTlExpression("__ttlp__->__ttlp1__ = __ttlp2__;",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern5_1, ruleConstructExpression5_1, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		TTlExpression rulePattern5 = new TTlExpression("__ttlp__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression5 = new TTlExpression("mpz_init_set(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern5, ruleConstructExpression5, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		

		return rules;

	}

	private static void addNoTransformRules(Set<TTlRule> rules) throws Exception {

		TTlExpression rulePattern1 = new TTlExpression("i __ttlop__ __ttlp2__", NodeType.Expression);
		TTlExpression ruleConstructExpression1 = new TTlExpression("i __ttlop__ __ttlp2__", NodeType.Expression);
		rules.add(new TTlRule(rulePattern1, ruleConstructExpression1, NodeType.Expression, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		TTlExpression rulePattern2 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Expression);
		TTlExpression ruleConstructExpression2 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Expression);
		rules.add(new TTlRule(rulePattern2, ruleConstructExpression2, NodeType.Expression, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));
/*
		TTlExpression rulePattern3 = new TTlExpression("int i;", NodeType.Statement);
		TTlExpression ruleConstructExpression3 = new TTlExpression("int i;", NodeType.Statement);
		rules.add(new TTlRule(rulePattern3, ruleConstructExpression3, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));
		TTlExpression rulePattern4 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Statement);
		TTlExpression ruleConstructExpression4 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Statement);
		rules.add(new TTlRule(rulePattern4, ruleConstructExpression4, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));
		TTlExpression rulePattern5 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Statement);
		TTlExpression ruleConstructExpression5 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Statement);
		rules.add(new TTlRule(rulePattern5, ruleConstructExpression5, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));
		TTlExpression rulePattern6 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Statement);
		TTlExpression ruleConstructExpression6 = new TTlExpression("j __ttlop__ __ttlp2__", NodeType.Statement);
		rules.add(new TTlRule(rulePattern6, ruleConstructExpression6, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));*/

	}
}