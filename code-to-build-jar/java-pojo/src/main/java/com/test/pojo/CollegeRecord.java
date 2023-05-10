package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollegeRecord {
	protected String id;

	protected List<String> description;

	protected List<CollegeRecord1> collegeRecord1;
	protected List<CollegeRecord2> collegeRecord2;

	public List<String> getDescription() {
		if (description == null) {
			description = new ArrayList<String>();
		}
		return this.description;
	}

	public String getId() {
		return id;
	}

	public List<CollegeRecord1> getcollegeRecord1() {
		if (collegeRecord1 == null) {
			collegeRecord1 = new ArrayList<CollegeRecord1>();
		}
		return this.collegeRecord1;
	}

	public List<CollegeRecord2> getcollegeRecord2() {
		if (collegeRecord2 == null) {
			collegeRecord2 = new ArrayList<CollegeRecord2>();
		}
		return this.collegeRecord2;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

	public void setId(String value) {
		this.id = value;
	}

	public void setcollegeRecord1(List<CollegeRecord1> collegeRecord1) {
		this.collegeRecord1 = collegeRecord1;
	}

	public void setcollegeRecord2(List<CollegeRecord2> collegeRecord2) {
		this.collegeRecord2 = collegeRecord2;
	}

}
