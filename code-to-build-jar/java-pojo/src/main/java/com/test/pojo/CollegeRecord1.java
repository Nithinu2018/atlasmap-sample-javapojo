package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollegeRecord1
{
	protected String id;

	protected List<String> description;

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

	public List<DepartmentRecord> getDepartmentRecord()
	{
		if (departmentRecord == null)
		{
			departmentRecord = new ArrayList<DepartmentRecord>();
		}
		return this.departmentRecord;
	}

	public void setDescription(List<String> description)
	{
		this.description = description;
	}

	public void setId(String value)
	{
		this.id = value;
	}

	public void setDepartmentRecord(List<DepartmentRecord> departmentRecord)
	{
		this.departmentRecord = departmentRecord;
	}

}
