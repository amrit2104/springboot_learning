package com.amrit.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.amrit.springboot.learnjpahibernate.course.Course;
import com.amrit.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.amrit.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		repository.insert(new Course(1,"Learn JPA","Amrit"));
		repository.insert(new Course(2,"Learn AWS","Gaurav"));
		repository.insert(new Course(3,"Learn Azure","Rath"));
		
		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
	}
}
