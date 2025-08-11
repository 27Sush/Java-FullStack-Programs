package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchingStudentObject {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Student s = manager.find(Student.class , 3);
		if(s!=null) {
			System.out.println("STUDENT ID : "+s.getStudentid());
			System.out.println("NAME : "+s.getName());
			System.out.println("AGE : "+s.getAge());
			System.out.println("ADDRESS : "+s.getAddress());
		} else {
			System.out.println("STUDENT ID DOESNOT EXIST...");
		}
	}

}
