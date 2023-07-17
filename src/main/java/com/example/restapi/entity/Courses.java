package com.example.restapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cname;
	private String cprice;
	public Courses(int id, String cname, String cprice) {
		super();
		this.id = id;
		this.cname = cname;
		this.cprice = cprice;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCprice() {
		return cprice;
	}
	public void setCprice(String cprice) {
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", Cname=" + cname + ", Cprice=" + cprice + "]";
	}
	

}
