package com.amrit.springboot.learnjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.amrit.springboot.learnjpahibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		repository.insert(new Course(1,"Learn Cloud","Amrit"));
		repository.insert(new Course(2,"Learn AWS","Gaurav"));
		repository.insert(new Course(3,"Learn Azure","Rath"));
		
		repository.deleteById(2);
	}
}
