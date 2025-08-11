package Annotations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Person p = new Person();
		p.setId(4);
		p.setName("Vignesh");
		p.setAge(24);
		p.setAddress("");
		
		transaction.begin();
		manager.persist(p);
		transaction.commit();
	}
	
}
