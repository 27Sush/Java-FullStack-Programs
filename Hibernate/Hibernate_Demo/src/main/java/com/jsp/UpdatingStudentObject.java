package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatingStudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student s = manager.find(Student.class, 1);
		if(s!=null) {
			s.setName("Ramesh Kumar");
			s.setAddress("Mumbai");
			
			transaction.begin();
			manager.merge(s);
			transaction.commit();
		} else {
			System.out.println("STUDENT ID DOESNOT EXIST...");
		}
	}

}
