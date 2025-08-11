package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create IOC container (ApplicationContext)
		ApplicationContext ac = new ClassPathXmlApplicationContext("configure.xml");
		
		// getting the object from IOC container
		Sample s = (Sample) ac.getBean("mysample");
		
		// or
		
		// Sample s = ac.getBean("mysample",Sample.class);
		
		// using the project to call test method
		s.test();

		
	}

}
