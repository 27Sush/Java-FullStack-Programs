package manyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MovieActorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		// create movie object1
		Movie movie1= new Movie();
		movie1.setMov_name("Harry Potter");
		movie1.setMov_lang("English");
		
		// Create actor object1
		Actor actor1 = new Actor();
		actor1.setAct_name("James");
		actor1.setAct_gender("Male");
		
		// Create actor object2
		Actor actor2 = new Actor();
		actor2.setAct_name("Mary");
		actor2.setAct_gender("Female");
		
		// create list and store all actors into it
		List<Actor> actorList1 = new ArrayList<>();
		actorList1.add(actor1);
		actorList1.add(actor2);
		
		// set actor list (multiple actors) to the movie object
		movie1.setActors(actorList1);
		
		// create movie object2
		Movie movie2 = new Movie();
		movie2.setMov_name("Bajrangi Bhaijaan");
		movie2.setMov_lang("Hindi");
		
		// create actor object3
		Actor actor3 = new Actor();
		actor3.setAct_name("Salman Khan");
		actor3.setAct_gender("Alpha Male");
		
		// create actor object4
		Actor actor4 = new Actor();
		actor4.setAct_name("Kareena Kapoor");
		actor4.setAct_gender("Female");
		
		// create actor object5
		Actor actor5 = new Actor();
		actor5.setAct_name("Nawaj");
		actor5.setAct_gender("Male");
		
		// create list to store all objects into it
		List<Actor> actorList2 = new ArrayList<>();
		actorList2.add(actor3);
		actorList2.add(actor4);
		actorList2.add(actor5);
		
		// set actor list (multiple actors) to the movie object
		movie2.setActors(actorList2);
		
		transaction.begin();
		manager.persist(movie1);
		manager.persist(actor1);
		manager.persist(actor2);
		manager.persist(movie2);	
		manager.persist(actor3);
		manager.persist(actor4);
		manager.persist(actor5);
		transaction.commit();
		
		
	}

}
