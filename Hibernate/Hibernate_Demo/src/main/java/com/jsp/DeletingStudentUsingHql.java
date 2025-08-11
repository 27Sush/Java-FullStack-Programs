package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeletingStudentUsingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Query q = manager.createQuery("delete from Student s where s.address='Hyderabad'");
		
		transaction.begin();
		int result = q.executeUpdate();
		transaction.commit();
		
		if(result==0) {
			System.out.println("Address Hyderabad not found...");
		} else {
			System.out.println("Student data deleted successfully...");
		}
		
	}

}
