package com.example.restapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.restapi.dao.Repository;
import com.example.restapi.entity.Courses;



public class CourseService {

	@Autowired
	private Repository repo;
	
	//adding a couse
	public void savecourse(Courses course) {
		// TODO Auto-generated method stub
		this.repo.save(course);
		
	}

	
	//getting all courses

	public List<Courses> getAllCourse() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	
	//getting one course

	public void getCourseById(int id) {
		// TODO Auto-generated method stub
		this.repo.findById(id);
		
	}

	
	//updating course

	public void updateCourse(Courses course) {
		// TODO Auto-generated method stub
		this.repo.save(course);
		
	}

	//deleting a course

	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		this.deleteCourse(id);
		
	}

	
	
}

