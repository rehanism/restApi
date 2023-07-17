package com.example.restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.entity.Courses;
import com.example.restapi.service.CourseService;



@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	//posting a course
	@PostMapping("/courses")
	public void saveCourse(@RequestBody Courses course)
	{
		this.service.savecourse(course);
	}

	//getting all courses
	@GetMapping("/courses")
	public List<Courses> getAllCourse()
	{
		return this.service.getAllCourse();
	}
	
	//getting a single course
	@GetMapping("/courses/{id}")
	public void getCourse(@PathVariable("id") int id)
	{
		this.service.getCourseById(id);
	}
	
	//updating course
	@PutMapping("/courses")
	public void updateCourse(@RequestBody Courses course)
	{
		this.service.updateCourse(course);
	}
	
	//deleting course
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable("id") int id)
	{
		this.service.deleteCourse(id);
	}
}
