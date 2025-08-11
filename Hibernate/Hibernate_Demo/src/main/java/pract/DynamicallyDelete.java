package pract;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicallyDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Teacher t = manager.find(Teacher.class, 5);
		if(t!=null) {
			t.setTname("Maya");
			
			transaction.begin();
			manager.merge(t);
			transaction.commit();
		} else {
			System.out.println("FAILED");
		}
		
	}

}
