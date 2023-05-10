package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRecord {
	protected String id;

	protected List<String> description;

	public List<String> getDescription() {
		if (description == null) {
			description = new ArrayList<String>();
		}
		return this.description;
	}

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

}
