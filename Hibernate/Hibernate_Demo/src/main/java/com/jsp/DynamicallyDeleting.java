package com.jsp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DynamicallyDeleting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student ID : ");
		int id = sc.nextInt();
		
		Student s = manager.find(Student.class, id);
		if(s!=null) {
			
			transaction.begin();
			manager.remove(s);
			transaction.commit();
		} else {
			System.out.println("STUDENT ID DOESNOT EXIST...");
		}
		
	}

}
