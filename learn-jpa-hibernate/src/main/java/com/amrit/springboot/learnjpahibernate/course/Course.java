package com.amrit.springboot.learnjpahibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity (name="Course_Details") : we can put the mapping in this way as well.
@Entity
public class Course 
{
	@Id //making id as the primary key.
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="author")
	private String author;
	
	//we need to get:
		//constructor
		//getters
		//toString
		
	public Course()
	{
		
	}
	
	
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	// getters will just get the values, while setters can also help in giving output.
	


	public long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getAuthor() {
		return author;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	
}
