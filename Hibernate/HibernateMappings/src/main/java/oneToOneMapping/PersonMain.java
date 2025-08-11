package oneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		// creating AadharCard object
		AadharCard aadhar = new AadharCard();
		aadhar.setAadharno(763534523);
		
		// creating Person object
		Person person = new Person();
		person.setName("Sushant");
		person.setAge(24);
		
		// set aadharCard object to Person object
		person.setAadharCard(aadhar);
		
		transaction.begin();
		manager.persist(person);
		manager.persist(aadhar);
		transaction.commit();	
		
	}

}
