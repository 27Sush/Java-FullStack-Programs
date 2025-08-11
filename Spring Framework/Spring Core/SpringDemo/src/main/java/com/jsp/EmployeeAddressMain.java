package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create IOC container using ApplicationContext interface
		ApplicationContext ac = new ClassPathXmlApplicationContext("configure.xml");
		
		// get object of Employee form IOC container (configure.xml)
		Employee e = (Employee)ac.getBean("myemployee");
		//or  Employee e = ac.getBean("myemployee", Employee.class)
		
		// using employee object, accessing employee class members
		System.out.println(e.getName());
		System.out.println(e.getAge());
		
		
		// using employee object, accessing address class members
		System.out.println(e.getAddress().getCity());
		System.out.println(e.getAddress().getPincode());
		
		

	}

}
