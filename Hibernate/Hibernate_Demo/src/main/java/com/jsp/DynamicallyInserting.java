package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DynamicallyInserting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the student name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the student age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the student address : ");
		String address = sc.nextLine();
		
		Student s = new Student();
		
		s.setStudentid(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		transaction.begin();
		manager.persist(s);
		transaction.commit();
	}

}
