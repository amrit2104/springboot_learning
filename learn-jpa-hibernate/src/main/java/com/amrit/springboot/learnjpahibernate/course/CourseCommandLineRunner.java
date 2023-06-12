package com.amrit.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.amrit.springboot.learnjpahibernate.course.Course;
import com.amrit.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.amrit.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.amrit.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		repository.save(new Course(1,"Learn JPA","Amrit"));
		repository.save(new Course(2,"Learn AWS","Gaurav"));
		repository.save(new Course(3,"Learn Azure","Rath"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Amrit"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Azure"));
	}
}
