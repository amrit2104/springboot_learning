package com.amrit.springboot.learnjpahibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.amrit.springboot.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional //this we need to enable to execute queries with JPA.
public class CourseJpaRepository 
{
	//Entity manager is used to manage our entity.
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
	}
	
	public Course findById(long id)
	{
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id)
	{
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
