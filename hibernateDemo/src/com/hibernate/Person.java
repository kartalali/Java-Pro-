package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
	
	public Person() {}
	
	/*
	 * public Person( String firstname, String lastname, int age, int emp_id) {
	 * this.firstname = firstname; this.lastname = lastname; this.age = age;
	 * this.emp_id = emp_id;
	 * 
	 * }
	 */
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "emp_id")
	private int emp_id;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
}
