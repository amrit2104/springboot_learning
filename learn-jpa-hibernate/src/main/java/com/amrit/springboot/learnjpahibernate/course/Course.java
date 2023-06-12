package com.amrit.springboot.learnjpahibernate.course;

public class Course 
{
	private long id;
	private String name;
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
