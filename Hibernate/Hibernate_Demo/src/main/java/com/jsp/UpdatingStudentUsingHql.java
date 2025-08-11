package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdatingStudentUsingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Query q = manager.createQuery("update Student s set s.address='Kochi' where s.name='Maya'");
		
		transaction.begin();
		int result = q.executeUpdate();
		transaction.commit();
		
		if(result==0) {
			System.out.println("Student Maya does not exist...");
		} else {
			System.out.println("Maya's address updated successfully...");
		}
		
	}

}
