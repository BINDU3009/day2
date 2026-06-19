package com.example.studentdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String course;
	private int age;
	
	public Student() {
		
	}
	public Student(int id,String name,String email,String course,int age) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.course=course;
		this.age=age;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return course;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {

	    return "Student [id=" + id +
	           ", name=" + name +
	           ", email=" + email +
	           ", course=" + course +
	           ", age=" + age + "]";

	}
}
