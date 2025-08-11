package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicallyUpdatingValuesUsingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Query q = manager.createQuery("update Student s set s.age=?1 , s.address=?2 where s.name=?3");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new address : ");
		String address = sc.nextLine();
		
		System.out.println("Enter student's name to update details...");
		String name = sc.nextLine();
		
		q.setParameter(1, age);
		q.setParameter(2, address);
		q.setParameter(3, name);
		
		transaction.begin();
		q.executeUpdate();
		transaction.commit();
		

	}

}
