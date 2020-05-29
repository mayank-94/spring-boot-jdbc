package com.spring.jdbc.springbootjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.jdbc.springbootjdbc.dao.DepartmentJdbcDAO;
import com.spring.jdbc.springbootjdbc.dao.PersonJdbcDAO;
import com.spring.jdbc.springbootjdbc.entity.Person;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;
	
	@Autowired
	DepartmentJdbcDAO depDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Persons Info -> {}", dao.retrieveAll());	
		logger.info("User Id 10001 -> {}", dao.findById(10001));
		logger.info("Deleting id 10002, Rows deleted -> {} ", dao.deleteById(10002));
		logger.info("Insert new Person 10002 -> {}", dao.insert(new 
				Person(10002, "Dexter", "New Jersey", new Date())));
		
		logger.info("Update 10003 -> {}", dao.update(new 
				Person(10003, "Paul", "California", new Date())));
		
		logger.info("Person details with R -> {}", dao.retrieveNamesWithR());
		logger.info("Department details -> {}", depDao.retrieveAllDept());
		logger.info("Persons from Department -> {}", depDao.retrievePersonInDept());
		logger.info("Accounts Department with salary > 35000 -> {}", 
				depDao.retrieveAllWithDeptAsAccounts("Accounts", 35000));
	}

}
