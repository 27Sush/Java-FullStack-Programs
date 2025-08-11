package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	
	@Value(value="Sushant")
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Value(value="70000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
