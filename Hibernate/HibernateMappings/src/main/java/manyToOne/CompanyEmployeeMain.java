package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		// create company object
		Company company = new Company();
		company.setComp_name("Zensar");
		company.setComp_address("Pune");
		
		// create employee object
		Employee employee1 = new Employee();
	    employee1.setEmp_name("Sush");
	    employee1.setEmp_salary(89000);
	    employee1.setDesignation("Manager");

		Employee employee2 = new Employee();
	    employee2.setEmp_name("Sachin");
	    employee2.setEmp_salary(35000);
	    employee2.setDesignation("HR");
	    
		Employee employee3 = new Employee();
	    employee3.setEmp_name("Tejas");
	    employee3.setEmp_salary(40000);
	    employee3.setDesignation("Analyst");
	    
	    // set multiple employee objects to one company object
	    employee1.setCompany(company);
	    employee2.setCompany(company);
	    employee3.setCompany(company);
	    
	    // store all objects into DB
	    transaction.begin();
	    manager.persist(employee1);
	    manager.persist(employee2);
	    manager.persist(employee1);
	    manager.persist(company);
	    transaction.commit();
	}

}
