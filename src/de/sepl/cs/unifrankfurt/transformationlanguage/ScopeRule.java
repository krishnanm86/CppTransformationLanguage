package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;

public class ScopeRule {

	String lhs, Rhs;
	List<WhereClause> conditions;
	List<TagUpdate> tagUpdates;
}
