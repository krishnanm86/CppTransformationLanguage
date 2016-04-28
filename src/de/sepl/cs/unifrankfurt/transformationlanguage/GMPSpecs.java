package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class GMPSpecs {

	public static Set<TTlRule> populateRules() throws Exception {
		Set<TTlRule> rules = new HashSet<TTlRule>();

		TTlExpression rulePattern10 = new TTlExpression("__ttlp__ = __ttlp2__ % __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression10 = new TTlExpression("mpz_mod(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern10, ruleConstructExpression10, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 6
		// -mpz_init(e1)
		// +e1 = 0
		TTlExpression rulePattern6 = new TTlExpression("__ttlp__ = 0;", NodeType.Statement);
		TTlExpression ruleConstructExpression6 = new TTlExpression("mpz_init(__ttlp__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern6, ruleConstructExpression6, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 1
		// -mpz_add(e1, e2, e3)
		// +e1 = e2 + e3
		TTlExpression rulePattern1 = new TTlExpression("__ttlp__ = __ttlp2__ + __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression1 = new TTlExpression("mpz_add(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern1, ruleConstructExpression1, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 12
		// -mpz_mul(e1, e2, e3)
		// +e1 = e2 * e3
		TTlExpression rulePattern12 = new TTlExpression("__ttlp__ = __ttlp2__ * __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression12 = new TTlExpression("mpz_mul(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern12, ruleConstructExpression12, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 25
		// -mpz_set(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern25 = new TTlExpression("__ttlp__ = __ttlp2__ ;", NodeType.Statement);
		TTlExpression ruleConstructExpression25 = new TTlExpression("mpz_init_set(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern25, ruleConstructExpression25, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 30
		// -mpz_cmp(e1, e2)
		// +(e1 - e2)
		TTlExpression rulePattern30 = new TTlExpression("(__ttlp__ - __ttlp2__);", NodeType.Statement);
		TTlExpression ruleConstructExpression30 = new TTlExpression("mpz_cmp_ui(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern30, ruleConstructExpression30, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 29
		// -(mpz_t*)malloc(sizeof(mpz_t)*e1);
		// +(int*)malloc(sizeof(int)*e1);
		TTlExpression rulePattern29 = new TTlExpression("int* __ttlname__ = (int*)malloc(sizeof(int)*__ttlp__);",
				NodeType.Declaration);
		TTlExpression ruleConstructExpression29 = new TTlExpression(
				"mpz_t* __ttlname__ = (mpz_t*)malloc(sizeof(mpz_t)*__ttlp__);", NodeType.Declaration);
		rules.add(new TTlRule(rulePattern29, ruleConstructExpression29, NodeType.Declaration,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// -----------------------------------------------------------------------

		// 2
		// -mpz_add_ui(e1, e2, e3)
		// +e1 = e2 + e3
		TTlExpression rulePattern2 = new TTlExpression("__ttlp__ = __ttlp2__ + __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression("mpz_add_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);

		rules.add(new TTlRule(rulePattern2, ruleConstructExpression2, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 3
		// -mpz_fdiv_q_2exp(e1, e2, e3)
		// +e1 = e2 >> e3
		TTlExpression rulePattern3 = new TTlExpression("__ttlp__ = __ttlp2__ >> __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression3 = new TTlExpression("mpz_fdiv_q_2exp(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern3, ruleConstructExpression3, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 4
		// -mpz_fdiv_r_2exp(e1, e2, e3)
		// +e1 = e2 & e2
		TTlExpression rulePattern4 = new TTlExpression("__ttlp__ = __ttlp2__ & __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression4 = new TTlExpression("mpz_fdiv_r_2exp(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern4, ruleConstructExpression4, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 5
		// -mpz_get_str(e1, 10, e2)
		// +sprintf(e1, "%ld", e2)
		TTlExpression rulePattern5 = new TTlExpression("sprintf(__ttlp__, \"l%d\", __ttlp2__);", NodeType.Statement);
		TTlExpression ruleConstructExpression5 = new TTlExpression("mpz_get_str(__ttlp__, 10, __ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern5, ruleConstructExpression5, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 7
		// -mpz_init_set(e1, e2)
		// +e1 = e2
		/*
		 * TTlExpression rulePattern7 = new TTlExpression(
		 * "__ttlp__ = __ttlp2__;", NodeType.Statement); TTlExpression
		 * ruleConstructExpression7 = new
		 * TTlExpression("mpz_init_set(__ttlp__,__ttlp2__);",
		 * NodeType.Statement); rules.add(new TTlRule(rulePattern7,
		 * ruleConstructExpression7, NodeType.Statement, new HashMap<Scope,
		 * String>(), new HashMap<Tag, String>()));
		 */

		// 8
		// -mpz_init_set_si(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern8 = new TTlExpression("__ttlp__ = -__ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression8 = new TTlExpression("mpz_init_set_si(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern8, ruleConstructExpression8, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 9
		// -mpz_init_set_ui(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern9 = new TTlExpression("__ttlp__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression9 = new TTlExpression("mpz_init_set_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern9, ruleConstructExpression9, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 10
		// -mpz_mod(e1, e2, e3)
		// +e1 = e2 % e3

		// 11
		// -mpz_mod_ui(e1, e2, e3)
		// +e1 = e2 % e3
		TTlExpression rulePattern11 = new TTlExpression("__ttlp__ = __ttlp2__ % __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression11 = new TTlExpression("mpz_mod_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern11, ruleConstructExpression11, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 13
		// -mpz_get_ui(e1)
		// +(e1 % 2)
		/*
		 * TTlExpression rulePattern13 = new TTlExpression(
		 * "__ttlp__ % __ttlp2__ ;", NodeType.Statement); TTlExpression
		 * ruleConstructExpression13 = new
		 * TTlExpression("mpz_get_ui(__ttlp__,__ttlp2__);", NodeType.Statement);
		 * rules.add(new TTlRule(rulePattern13, ruleConstructExpression13,
		 * NodeType.Statement, new HashMap<Scope, String>(), new HashMap<Tag,
		 * String>()));
		 */

		// 14
		// -mpz_invert(e1, e2, e3)
		// +e1 = mul_inv(e2, e3)
		TTlExpression rulePattern14 = new TTlExpression("__ttlp__ = mul_inv(__ttlp2__, __ttlp3__);",
				NodeType.Statement);
		TTlExpression ruleConstructExpression14 = new TTlExpression("mpz_invert(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern14, ruleConstructExpression14, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 15
		// -mpz_tdiv_q_ui(e1, e2, e3)
		// +e1 = e2 / e3
		TTlExpression rulePattern15 = new TTlExpression("__ttlp__ = __ttlp2__ / __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression15 = new TTlExpression("mpz_tdiv_q_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern15, ruleConstructExpression15, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 16
		// -mpz_mul_ui(e1, e2, e3)
		// +e1 = e2 * e3
		TTlExpression rulePattern16 = new TTlExpression("__ttlp__ = __ttlp2__ * __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression16 = new TTlExpression("mpz_mul_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern16, ruleConstructExpression16, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 17
		// -mpz_sub(e1, e2, e3)
		// +e1 = e2 - e3
		/*
		 * TTlExpression rulePattern17 = new TTlExpression(
		 * "__ttlp__ = __ttlp2__ - __ttlp3__;", NodeType.Statement);
		 * TTlExpression ruleConstructExpression17 = new
		 * TTlExpression("mpz_sub(__ttlp__,__ttlp2__,__ttlp3__);",
		 * NodeType.Statement); rules.add(new TTlRule(rulePattern17,
		 * ruleConstructExpression17, NodeType.Statement, new HashMap<Scope,
		 * String>(), new HashMap<Tag, String>()));
		 */

		// 18
		// -mpz_sub_ui(e1, e2, e3)
		// +e1 = e2 - e3
		TTlExpression rulePattern18 = new TTlExpression("__ttlp__ = __ttlp2__ - __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression18 = new TTlExpression("mpz_sub_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern18, ruleConstructExpression18, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 19
		// -mpz_mul_2exp(e1, e2, e3)
		// +e1 = e2 << e3
		TTlExpression rulePattern19 = new TTlExpression("__ttlp__ = __ttlp2__ << __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression19 = new TTlExpression("mpz_mul_2exp(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern19, ruleConstructExpression19, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 20
		// -mpz_neg(e1, e2)
		// +e1 = -e2
		TTlExpression rulePattern20 = new TTlExpression("__ttlp__ = -__ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression20 = new TTlExpression("mpz_neg(__ttlp__,__ttlp2__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern20, ruleConstructExpression20, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 21
		// -mpz_sizeinbase(e1, e2)
		// +numPlaces(e1,e2)
		TTlExpression rulePattern21 = new TTlExpression("numplaces(__ttlp__, __ttlp2__);", NodeType.Statement);
		TTlExpression ruleConstructExpression21 = new TTlExpression("mpz_sizeinbase(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern21, ruleConstructExpression21, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 22
		// -mpz_powm(e1, e2, e3, e4)
		// +e1 = (int)pow((double)e2, (double)e3) % e4
		TTlExpression rulePattern22 = new TTlExpression(
				"__ttlp__ = (int)pow((double)__ttlp2__, (double)__ttlp3__) % __ttlp4__;", NodeType.Statement);
		TTlExpression ruleConstructExpression22 = new TTlExpression(
				"mpz_powm(__ttlp__,__ttlp2__,__ttlp3__, __ttlp4__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern22, ruleConstructExpression22, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 23
		// -mpz_powm_ui(e1, e2, e3, e4)
		// +e1 = (int)pow((double)e2, (double)e3) % e4
		TTlExpression rulePattern23 = new TTlExpression(
				"__ttlp__ = (int)pow((double)__ttlp2__, (double)__ttlp3__) % __ttlp4__;", NodeType.Statement);
		TTlExpression ruleConstructExpression23 = new TTlExpression(
				"mpz_powm_ui(__ttlp__,__ttlp2__,__ttlp3__,__ttlp4__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern23, ruleConstructExpression23, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 26
		// -mpz_set_ui(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern26 = new TTlExpression("__ttlp__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression26 = new TTlExpression("mpz_set_ui(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern26, ruleConstructExpression26, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 27
		// -mpz_set_si(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern27 = new TTlExpression("__ttlp__ = -__ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression27 = new TTlExpression("mpz_set_si(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern27, ruleConstructExpression27, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 28
		// -mpz_urandomm(e1, e2, e3)
		// +e1 = rand()
		TTlExpression rulePattern28 = new TTlExpression("__ttlp__ = rand();", NodeType.Statement);
		TTlExpression ruleConstructExpression28 = new TTlExpression("mpz_urandomm(__ttlp__,__ttlp__,__ttlp__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern28, ruleConstructExpression28, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 31
		// -mpz_cmp_si(e1, e2)
		// +(e1 - e2)
		/*
		 * TTlExpression rulePattern31 = new TTlExpression(
		 * "__ttlp__ - __ttlp2__;", NodeType.Statement); TTlExpression
		 * ruleConstructExpression31 = new
		 * TTlExpression("mpz_cmp_si(__ttlp__,__ttlp2__);", NodeType.Statement);
		 * rules.add(new TTlRule(rulePattern31, ruleConstructExpression31,
		 * NodeType.Statement, new HashMap<Scope, String>(), new HashMap<Tag,
		 * String>()));
		 */

		// 33
		// -mpz_tstbit(e1, e2)
		// +((e1) & (1<<(e2)))
		TTlExpression rulePattern33 = new TTlExpression("(__ttlp__) & (1<<(__ttlp2__)));", NodeType.Statement);
		TTlExpression ruleConstructExpression33 = new TTlExpression("mpz_tstbit(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern33, ruleConstructExpression33, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		return rules;
	}

	void dummy() throws Exception {

		Set<TTlRule> rules = new HashSet<TTlRule>();

		// 2
		// -mpz_add_ui(e1, e2, e3)
		// +e1 = e2 + e3
		TTlExpression rulePattern2 = new TTlExpression("__ttlp__ = __ttlp2__ + __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression("mpz_add_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);

		rules.add(new TTlRule(rulePattern2, ruleConstructExpression2, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 3
		// -mpz_fdiv_q_2exp(e1, e2, e3)
		// +e1 = e2 >> e3
		TTlExpression rulePattern3 = new TTlExpression("__ttlp__ = __ttlp2__ >> __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression3 = new TTlExpression("mpz_fdiv_q_2exp(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern3, ruleConstructExpression3, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 4
		// -mpz_fdiv_r_2exp(e1, e2, e3)
		// +e1 = e2 & e2
		TTlExpression rulePattern4 = new TTlExpression("__ttlp__ = __ttlp2__ & __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression4 = new TTlExpression("mpz_fdiv_r_2exp(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern4, ruleConstructExpression4, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 5
		// -mpz_get_str(e1, 10, e2)
		// +sprintf(e1, "%ld", e2)
		TTlExpression rulePattern5 = new TTlExpression("sprintf(__ttlp__, \"l%d\", __ttlp2__);", NodeType.Statement);
		TTlExpression ruleConstructExpression5 = new TTlExpression("mpz_get_str(__ttlp__, 10, __ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern5, ruleConstructExpression5, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 7
		// -mpz_init_set(e1, e2)
		// +e1 = e2
		/*
		 * TTlExpression rulePattern7 = new TTlExpression(
		 * "__ttlp__ = __ttlp2__;", NodeType.Statement); TTlExpression
		 * ruleConstructExpression7 = new
		 * TTlExpression("mpz_init_set(__ttlp__,__ttlp2__);",
		 * NodeType.Statement); rules.add(new TTlRule(rulePattern7,
		 * ruleConstructExpression7, NodeType.Statement, new HashMap<Scope,
		 * String>(), new HashMap<Tag, String>()));
		 */

		// 8
		// -mpz_init_set_si(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern8 = new TTlExpression("__ttlp__ = -__ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression8 = new TTlExpression("mpz_init_set_si(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern8, ruleConstructExpression8, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 9
		// -mpz_init_set_ui(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern9 = new TTlExpression("__ttlp__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression9 = new TTlExpression("mpz_init_set_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern9, ruleConstructExpression9, NodeType.Statement, new HashMap<Scope, String>(),
				new HashMap<Tag, String>()));

		// 10
		// -mpz_mod(e1, e2, e3)
		// +e1 = e2 % e3

		// 11
		// -mpz_mod_ui(e1, e2, e3)
		// +e1 = e2 % e3
		TTlExpression rulePattern11 = new TTlExpression("__ttlp__ = __ttlp2__ % __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression11 = new TTlExpression("mpz_mod_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern11, ruleConstructExpression11, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 13
		// -mpz_get_ui(e1)
		// +(e1 % 2)
		/*
		 * TTlExpression rulePattern13 = new TTlExpression(
		 * "__ttlp__ % __ttlp2__ ;", NodeType.Statement); TTlExpression
		 * ruleConstructExpression13 = new
		 * TTlExpression("mpz_get_ui(__ttlp__,__ttlp2__);", NodeType.Statement);
		 * rules.add(new TTlRule(rulePattern13, ruleConstructExpression13,
		 * NodeType.Statement, new HashMap<Scope, String>(), new HashMap<Tag,
		 * String>()));
		 */

		// 14
		// -mpz_invert(e1, e2, e3)
		// +e1 = mul_inv(e2, e3)
		TTlExpression rulePattern14 = new TTlExpression("__ttlp__ = mul_inv(__ttlp2__, __ttlp3__);",
				NodeType.Statement);
		TTlExpression ruleConstructExpression14 = new TTlExpression("mpz_invert(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern14, ruleConstructExpression14, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 15
		// -mpz_tdiv_q_ui(e1, e2, e3)
		// +e1 = e2 / e3
		TTlExpression rulePattern15 = new TTlExpression("__ttlp__ = __ttlp2__ / __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression15 = new TTlExpression("mpz_tdiv_q_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern15, ruleConstructExpression15, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 16
		// -mpz_mul_ui(e1, e2, e3)
		// +e1 = e2 * e3
		TTlExpression rulePattern16 = new TTlExpression("__ttlp__ = __ttlp2__ * __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression16 = new TTlExpression("mpz_mul_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern16, ruleConstructExpression16, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 17
		// -mpz_sub(e1, e2, e3)
		// +e1 = e2 - e3
		/*
		 * TTlExpression rulePattern17 = new TTlExpression(
		 * "__ttlp__ = __ttlp2__ - __ttlp3__;", NodeType.Statement);
		 * TTlExpression ruleConstructExpression17 = new
		 * TTlExpression("mpz_sub(__ttlp__,__ttlp2__,__ttlp3__);",
		 * NodeType.Statement); rules.add(new TTlRule(rulePattern17,
		 * ruleConstructExpression17, NodeType.Statement, new HashMap<Scope,
		 * String>(), new HashMap<Tag, String>()));
		 */

		// 18
		// -mpz_sub_ui(e1, e2, e3)
		// +e1 = e2 - e3
		TTlExpression rulePattern18 = new TTlExpression("__ttlp__ = __ttlp2__ - __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression18 = new TTlExpression("mpz_sub_ui(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern18, ruleConstructExpression18, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 19
		// -mpz_mul_2exp(e1, e2, e3)
		// +e1 = e2 << e3
		TTlExpression rulePattern19 = new TTlExpression("__ttlp__ = __ttlp2__ << __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression19 = new TTlExpression("mpz_mul_2exp(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern19, ruleConstructExpression19, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 20
		// -mpz_neg(e1, e2)
		// +e1 = -e2
		TTlExpression rulePattern20 = new TTlExpression("__ttlp__ = -__ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression20 = new TTlExpression("mpz_neg(__ttlp__,__ttlp2__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern20, ruleConstructExpression20, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 21
		// -mpz_sizeinbase(e1, e2)
		// +numPlaces(e1,e2)
		TTlExpression rulePattern21 = new TTlExpression("numplaces(__ttlp__, __ttlp2__);", NodeType.Statement);
		TTlExpression ruleConstructExpression21 = new TTlExpression("mpz_sizeinbase(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern21, ruleConstructExpression21, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 22
		// -mpz_powm(e1, e2, e3, e4)
		// +e1 = (int)pow((double)e2, (double)e3) % e4
		TTlExpression rulePattern22 = new TTlExpression(
				"__ttlp__ = (int)pow((double)__ttlp2__, (double)__ttlp3__) % __ttlp4__;", NodeType.Statement);
		TTlExpression ruleConstructExpression22 = new TTlExpression(
				"mpz_powm(__ttlp__,__ttlp2__,__ttlp3__, __ttlp4__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern22, ruleConstructExpression22, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 23
		// -mpz_powm_ui(e1, e2, e3, e4)
		// +e1 = (int)pow((double)e2, (double)e3) % e4
		TTlExpression rulePattern23 = new TTlExpression(
				"__ttlp__ = (int)pow((double)__ttlp2__, (double)__ttlp3__) % __ttlp4__;", NodeType.Statement);
		TTlExpression ruleConstructExpression23 = new TTlExpression(
				"mpz_powm_ui(__ttlp__,__ttlp2__,__ttlp3__,__ttlp4__);", NodeType.Statement);
		rules.add(new TTlRule(rulePattern23, ruleConstructExpression23, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 26
		// -mpz_set_ui(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern26 = new TTlExpression("__ttlp__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression26 = new TTlExpression("mpz_set_ui(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern26, ruleConstructExpression26, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 27
		// -mpz_set_si(e1, e2)
		// +e1 = e2
		TTlExpression rulePattern27 = new TTlExpression("__ttlp__ = -__ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression27 = new TTlExpression("mpz_set_si(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern27, ruleConstructExpression27, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 28
		// -mpz_urandomm(e1, e2, e3)
		// +e1 = rand()
		TTlExpression rulePattern28 = new TTlExpression("__ttlp__ = rand();", NodeType.Statement);
		TTlExpression ruleConstructExpression28 = new TTlExpression("mpz_urandomm(__ttlp__,__ttlp__,__ttlp__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern28, ruleConstructExpression28, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

		// 31
		// -mpz_cmp_si(e1, e2)
		// +(e1 - e2)
		/*
		 * TTlExpression rulePattern31 = new TTlExpression(
		 * "__ttlp__ - __ttlp2__;", NodeType.Statement); TTlExpression
		 * ruleConstructExpression31 = new
		 * TTlExpression("mpz_cmp_si(__ttlp__,__ttlp2__);", NodeType.Statement);
		 * rules.add(new TTlRule(rulePattern31, ruleConstructExpression31,
		 * NodeType.Statement, new HashMap<Scope, String>(), new HashMap<Tag,
		 * String>()));
		 */

		// 33
		// -mpz_tstbit(e1, e2)
		// +((e1) & (1<<(e2)))
		TTlExpression rulePattern33 = new TTlExpression("(__ttlp__) & (1<<(__ttlp2__)));", NodeType.Statement);
		TTlExpression ruleConstructExpression33 = new TTlExpression("mpz_tstbit(__ttlp__,__ttlp2__);",
				NodeType.Statement);
		rules.add(new TTlRule(rulePattern33, ruleConstructExpression33, NodeType.Statement,
				new HashMap<Scope, String>(), new HashMap<Tag, String>()));

	}
}
