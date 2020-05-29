package com.spring.jdbc.springbootjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.springbootjdbc.entity.Department;
import com.spring.jdbc.springbootjdbc.entity.PersonDepartment;

@Repository
public class DepartmentJdbcDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * Retrieve all departments
	 */
	public List<Department> retrieveAllDept(){
		return jdbcTemplate.query("select * from department", new 
				BeanPropertyRowMapper<>(Department.class));
	}
	
	/*
	 * Retrieve all Accounts Department with salary > 35000
	 */
	public List<Department> retrieveAllWithDeptAsAccounts(String deptName, int salary){
		return jdbcTemplate.query("select * from department where dept_name=? "
				+ "and salary > ?", new Object[] {deptName, salary}, new
				BeanPropertyRowMapper<>(Department.class));
	}
	
	/*
	 * Join on Person and Department
	 */
	public List<PersonDepartment> retrievePersonInDept(){
		return jdbcTemplate.query("select person.name, person.location, department.dept_name" + 
				" from person join department on person.id = department.id", new 
				BeanPropertyRowMapper<>(PersonDepartment.class));
	}
	
}
