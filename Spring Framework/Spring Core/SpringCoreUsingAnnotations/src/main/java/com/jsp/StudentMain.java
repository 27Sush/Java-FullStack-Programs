package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		
		Student student = ac.getBean("student", Student.class);

		System.out.println(student.name);
		System.out.println(student.age);
	}

}
