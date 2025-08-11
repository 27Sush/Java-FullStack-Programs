package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		
		Person p = (Person) ac.getBean("person");

		System.out.println(p.name);
		System.out.println(p.age);
		
		System.out.println(p.address.city);
	}

}
