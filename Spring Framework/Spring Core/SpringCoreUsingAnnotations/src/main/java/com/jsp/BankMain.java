package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		
		City city = ac.getBean("city", City.class);
		
		System.out.println(city.name);
		
		city.sbi.info();
		
		city.hdfc.info();
		
		city.bank.info();

	}

}
