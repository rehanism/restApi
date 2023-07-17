package com.example.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.entity.Courses;

public interface Repository extends JpaRepository<Courses, Integer>{

}
