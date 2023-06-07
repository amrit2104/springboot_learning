package com.amrit.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;
// Link : url/courses
// Return Object : id, name, author

@RestController
public class CourseController // this is a class of name COurseCOntroller
{
	//we need to create a URL such that if a user hits the url the data below will be returned.
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() { // this is a method of name retrieveAllCourses
		 // here we create our new course.
		return Arrays.asList(
				new Course(1, "Learn AWS", "amrit"),
				new Course(2, "Learn DevOps","dude")
				);
	}
}
