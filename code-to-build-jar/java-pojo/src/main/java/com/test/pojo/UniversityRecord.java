package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class UniversityRecord {
	protected List<String> description;

	protected String universityId;

	protected List<CollegeRecord> collegeRecord;

	public List<String> getDescription() {
		if (description == null) {
			description = new ArrayList<String>();
		}
		return this.description;
	}

	public String getId() {
		return universityId;
	}

	public List<CollegeRecord> getCollegeRecord() {
		if (collegeRecord == null) {
			collegeRecord = new ArrayList<CollegeRecord>();
		}
		return this.collegeRecord;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

	public void setId(String value) {
		this.universityId = value;
	}

	public void setCollegeRecord(List<CollegeRecord> collegeRecord) {
		this.collegeRecord = collegeRecord;
	}
}
