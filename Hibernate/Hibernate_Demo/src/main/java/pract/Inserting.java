package pract;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Inserting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Teacher t = new Teacher();
		
		t.setTname("Shirish");
		t.setTage(25);
		
		transaction.begin();
		manager.persist(t);
		transaction.commit();
		
	}

}
