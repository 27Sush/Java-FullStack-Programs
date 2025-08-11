package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value(value="Mala")
	String name;
	
	@Value(value="25")
	int age;
	
	
	// DI through variable
	@Autowired
	Address address;

	
	/*
	 
	DI through setters
	@Autowired
	public void setAddress(Address address) {
		this.address=address;
	}
	
	DI through constructors
	@Autowired
	public Person(Address address){
	this.address=address;
	
	*/
}
