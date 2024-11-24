package com.testdemo;

// encapsulation practice;
public class Person {
	private String name;
	private String email;
	public int mobile;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	public int getMobile() {
		return mobile;
	}

}
