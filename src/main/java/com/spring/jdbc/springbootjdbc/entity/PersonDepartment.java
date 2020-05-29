package com.spring.jdbc.springbootjdbc.entity;

public class PersonDepartment {
	
	private String name;
	private String location;
	private String deptName;
	
	public PersonDepartment() {
		super();
	}
	
	public PersonDepartment(String name, String location, String deptName) {
		super();
		this.name = name;
		this.location = location;
		this.deptName = deptName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "PersonDepartment [name=" + name + ", location=" + location + ", deptName=" + deptName + "]";
	}	
}
