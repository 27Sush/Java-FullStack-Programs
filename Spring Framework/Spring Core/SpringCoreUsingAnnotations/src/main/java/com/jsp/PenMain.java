package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PenMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		
		Pen p = (Pen) ac.getBean("pen");
		
		System.out.println(p.brand);
		System.out.println(p.price);
	}
}
