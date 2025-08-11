package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayAllUsingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Query q = manager.createQuery("select s from Student s");
		List<Student> list = q.getResultList();
		
		for(Student s : list) {
			System.out.println("Student Id : "+s.getStudentid());
			System.out.println("Student name : "+s.getName());
			System.out.println("Student age : "+s.getAddress());
			System.out.println("Student address : "+s.getAddress());
			System.out.println("--------------------------------------------------");
		}
		
	}

}
