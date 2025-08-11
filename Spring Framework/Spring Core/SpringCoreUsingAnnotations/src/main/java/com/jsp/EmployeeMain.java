package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		
		Employee emp = (Employee) ac.getBean("employee");
		
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}
