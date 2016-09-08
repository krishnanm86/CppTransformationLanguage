package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;

public class TagUpdate {

	String tagname, tagvalue;
	List<WhereCondition> whereClauses;

	public TagUpdate(String tagname, List<WhereCondition> whereClauses) {
		super();
		this.tagname = tagname;
		this.whereClauses = whereClauses;
	}

	public void setTagValue() throws Exception {
		for (WhereCondition condition : whereClauses) {
			if (condition.check()) {
				tagvalue = condition.value;
			}
		}
	}
	
	public void setTagValueNew() throws Exception {
		for (WhereCondition condition : whereClauses) {
			if (condition.checkNew()) {
				tagvalue = condition.value;
			}
		}
	}

}
