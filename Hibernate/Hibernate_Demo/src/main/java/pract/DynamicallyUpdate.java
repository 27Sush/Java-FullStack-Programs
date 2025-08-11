package pract;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicallyUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		Query q = manager.createQuery("update Teacher t set t.tname=?1 , t.tage=?2 where t.tid=?3");
		
		System.out.println("NAME : ");
		String name = sc.nextLine();
		
		System.out.println("AGE : ");
		int age = sc.nextInt();
		
		System.out.println("ID : ");
		int id = sc.nextInt();
		
		q.setParameter(1, name);
		q.setParameter(2, age);
		q.setParameter(3, id);
	
		transaction.begin();
		q.executeUpdate();
		transaction.commit();
	}

}
