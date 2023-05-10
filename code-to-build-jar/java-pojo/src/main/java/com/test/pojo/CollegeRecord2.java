package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollegeRecord2
{

	protected String id;

	protected List<String> description;

	protected List<DepartmentRecord> departmentRecord_1;
	protected List<DepartmentRecord> departmentRecord;

	public List<String> getDescription()
	{
		if (description == null)
		{
			description = new ArrayList<String>();
		}
		return this.description;
	}

	public String getId()
	{
		return id;
	}

	public List<DepartmentRecord> getDepartmentRecord_1()
	{
		if (departmentRecord_1 == null)
		{
			departmentRecord_1 = new ArrayList<DepartmentRecord>();
		}
		return this.departmentRecord_1;
	}

	public List<DepartmentRecord> getDepartmentRecord() {
		return departmentRecord;
	}

	public void setDepartmentRecord(List<DepartmentRecord> departmentRecord) {
		this.departmentRecord = departmentRecord;
	}

	public void setDescription(List<String> description)
	{
		this.description = description;
	}

	public void setId(String value)
	{
		this.id = value;
	}

	public void setDepartmentRecord_1(List<DepartmentRecord> departmentRecord)
	{
		this.departmentRecord_1 = departmentRecord;
	}

}
