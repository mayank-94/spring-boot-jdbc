package com.spring.jdbc.springbootjdbc.entity;

public class Department {
	
	private int id;
	private int deptId;
	private String deptName;
	private int salary;
	
	public Department() {
		super();
	}

	public Department(int id, int deptId, String deptName, int salary) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.deptName = deptName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptId=" + deptId + ", deptName=" + deptName + ", salary=" + salary + "]";
	}	
}
