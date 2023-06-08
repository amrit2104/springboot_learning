package com.amrit.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
// Link : url/courses
// Return Object : id, name, author

@RestController
public class CurrencyConfigurationController // this is a class of name COurseCOntroller
{
	@Autowired
	private CurrencyServiceConfiguration configuration;
	//we need to create a URL such that if a user hits the url the data below will be returned.
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() { // this is a method of name retrieveAllCourses
		 // here we create our new course.
		return configuration;
	}
}
