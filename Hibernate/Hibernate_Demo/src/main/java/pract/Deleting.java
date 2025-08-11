package pract;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deleting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Teacher t = manager.find(Teacher.class, 3);
		
		if(t!=null) {
			transaction.begin();
			manager.remove(t);
			transaction.commit();
		} else {
			System.out.println("Invalid Id");
		}
	}

}
