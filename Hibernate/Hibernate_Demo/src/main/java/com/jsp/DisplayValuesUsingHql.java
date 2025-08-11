package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayValuesUsingHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Query q = manager.createQuery("select s from Student s where s.age>21");
		List<Student> list = q.getResultList();
		
		for(Student s : list) {
			
			System.out.println("NAME : "+s.getName());
			System.out.println("AGE : "+s.getAge());
			
		}
	}

}
