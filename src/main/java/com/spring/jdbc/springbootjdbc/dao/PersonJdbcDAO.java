package com.spring.jdbc.springbootjdbc.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.springbootjdbc.entity.Person;

@Repository 
public class PersonJdbcDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * Retrieve all
	 */
	public List<Person> retrieveAll(){
		return jdbcTemplate.query("select * from person", 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	/*
	 * Retrieve based on Id
	 */
	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id=?",
				new Object[] {id}, new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	/*
	 * Delete based on Id
	 */
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id=?", new Object[] {id});
	}
	
	/*
	 * Insert a new Person
	 */
	public int insert(Person person) {
		return jdbcTemplate.update("insert into person(id, name, location, birth_date)" + 
				"values(?, ?, ?, ?)",
				new Object[] {person.getId(), person.getName(), 
						person.getLocation(), new Timestamp(person.getBirthDate().getTime())});
	}
	
	/*
	 * Update a Person's details
	 */
	public int update(Person person) {
		return jdbcTemplate.update("update person set name=?, location=?, birth_date=? "
				+ " where id=?",
				new Object[] {person.getName(), person.getLocation(), 
						new Timestamp(person.getBirthDate().getTime()), person.getId()});
	}
	
	
	/*
	 * Retrieve people whose names starts with 'R'
	 */
	public List<Person> retrieveNamesWithR(){
		return jdbcTemplate.query("select * from person where name like 'R%'", 
				new BeanPropertyRowMapper<>(Person.class));		
	}
	
}
