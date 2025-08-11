package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DynamicallyUpdating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		Student s = manager.find(Student.class, id);
		if(s!=null) {

			System.out.println("Enter the student name to update : ");
			String name = sc.nextLine();
			
			System.out.println("Enter the age to update : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the address to update : ");
			String address = sc.nextLine();
	
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			transaction.begin();
			manager.merge(s);
			transaction.commit();
			
		} else {
			System.out.println("STUDENT ID DOESNOT EXIST...");
		}
		
		
	}

}
