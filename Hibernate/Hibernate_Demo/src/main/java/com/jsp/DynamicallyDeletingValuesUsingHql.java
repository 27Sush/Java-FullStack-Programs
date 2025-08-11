package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicallyDeletingValuesUsingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Query q = manager.createQuery("delete from Student s where s.name=?1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name to delete : ");
		String name = sc.nextLine();
		
		q.setParameter(1, name);
		
		transaction.begin();
		q.executeUpdate();
		transaction.commit();
		
		
	}

}
