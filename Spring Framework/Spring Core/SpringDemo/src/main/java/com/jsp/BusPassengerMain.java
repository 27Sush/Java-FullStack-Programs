package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusPassengerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("busconfigure.xml");
		
		Bus bus = ac.getBean("myBus", Bus.class);
		
		System.out.println(bus.busno);
		System.out.println(bus.droploc);
		System.out.println(bus.price);
		
		System.out.println(bus.passenger.name);
		System.out.println(bus.passenger.gender);
	}

}
