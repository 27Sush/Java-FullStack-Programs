package pract;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicallySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		Query q = manager.createQuery("select t from Teacher t");
		
		List<Teacher> l = q.getResultList();
		for(Teacher tt : l) {
			System.out.println(tt.getTid()+" "+tt.getTname()+" "+tt.getTage());
		}
	}

}
