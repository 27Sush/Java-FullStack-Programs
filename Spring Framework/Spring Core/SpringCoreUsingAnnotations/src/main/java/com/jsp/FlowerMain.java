package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlowerMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		
		Flower f1 =  ac.getBean("flower", Flower.class);
		Flower f2 =  ac.getBean("flower", Flower.class);
		
		System.out.println(f1);
		System.out.println(f2);
		
	}
}
