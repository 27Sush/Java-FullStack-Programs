package com.jsp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicallyDisplayValuesUsingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Query q = manager.createQuery("select s from Student s where s.address=?1");
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the address of the student : ");
		String address = sc.nextLine();
		
		q.setParameter(1, address);
		System.out.println("----------------------------------------");
		
		List<Student> list = q.getResultList();
		for(Student s : list) {
			
			System.out.println("NAME : "+s.getName());
			System.out.println("ADDRESS : "+s.getAddress());
			System.out.println("---------------------------");
		}

	}

}
