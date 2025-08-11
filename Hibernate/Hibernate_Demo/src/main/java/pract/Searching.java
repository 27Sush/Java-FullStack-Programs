package pract;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Teacher t = manager.find(Teacher.class, 3);
		if(t!=null) {
			System.out.println(t.getTid()+" "+t.getTname()+" "+t.getTage());
		} else {
			System.out.println("Incorrect ID");
		}
	}

}
