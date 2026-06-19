package com.example.employeedemo;

//import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private String dept;
	private double sal;
	private String jdate;
	
	public Employee() {
		
	}
	public Employee(int id,String name,String dept,double sal,String jdate) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		this.jdate=jdate;
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
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	public double getSal() {
		return sal;
	}
	public void setJdate(String jdate) {
		this.jdate=jdate;
	}
	public String getJdate() {
		return jdate;
	}

	@Override
	public String toString() {

	    return "Employee [id=" + id +
	           ", name=" + name +
	           ", dept=" + dept +
	           ", sal=" + sal +
	           ", jdate=" + jdate + "]";

	}
}
