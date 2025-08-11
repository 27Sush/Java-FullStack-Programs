package oneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		// Create Student object
		Student student = new Student();
		student.setName("Sushant");
		student.setAddress("Kolhapur");
		
		// Create Course object
		Course course1 = new Course();
		course1.setName("Java");
		course1.setFees(3500);
		course1.setDuration(3);
		
		Course course2 = new Course();
		course2.setName("SQL");
		course2.setFees(1500);
		course2.setDuration(1);
		
		Course course3 = new Course();
		course3.setName("WebTechnology");
		course3.setFees(2800);
		course3.setDuration(2);
		
		// create list to store all course objects into it 
		List<Course> courseslist = new ArrayList<Course>();
		courseslist.add(course1);
		courseslist.add(course2);
		courseslist.add(course3);
		
		// set course list to Student object
		student.setCourseslist(courseslist);
		
		// store all objects into DB		
		transaction.begin();
		manager.persist(student);
		manager.persist(course1);
		manager.persist(course2);
		manager.persist(course3);
		transaction.commit();

	}

}
