package com.jsp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstablishConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("dev");
		System.out.println("Database created...");
		
	}

}
