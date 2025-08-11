package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		
		User u = ac.getBean("user", User.class);
		
		System.out.println(u.name);
		
		u.nokia.calling();
		
		u.phone.calling();
		
		
	}

}
