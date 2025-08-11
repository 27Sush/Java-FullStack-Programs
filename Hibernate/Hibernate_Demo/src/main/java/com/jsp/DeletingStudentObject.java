package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletingStudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student s = manager.find(Student.class, 2);
		if(s!=null) {
			transaction.begin();
			manager.remove(s);
			transaction.commit();
		} else {
			System.out.println("STUDENT ID DOESNOT EXIST...");
		}
	}
}
