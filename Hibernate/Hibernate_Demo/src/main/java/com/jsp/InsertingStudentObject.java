package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertingStudentObject {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		// creating student object
		Student s = new Student();
			
		// set values to student object
		s.setStudentid(3);
		s.setName("Purvi");
		s.setAge(22);
		s.setAddress("Chennai");
		
		// start the transaction 
		transaction.begin();
		
		// to insert student object into DB
		manager.persist(s);
		
		// end the transaction and save the changes to DB
		transaction.commit();
		
	}
}
