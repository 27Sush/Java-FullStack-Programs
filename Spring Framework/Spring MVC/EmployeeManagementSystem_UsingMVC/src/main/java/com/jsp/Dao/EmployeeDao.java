package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Dto.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	// to insert employee obj into DB (to insert data sent by user)
	public String insertEmployee(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return "Employee details are stored successfully...";
	}
	
	// to search for employee object based on ID
	public Employee getEmployeeById(int id) {
		Employee emp = manager.find(Employee.class, id);
		return emp;
	}
	
	// to delete an employee object from DB based on ID
	public int deleteEmployeeById(int id) {    // can use int/booleam/String
		Employee emp = manager.find(Employee.class, id);
		if(emp!=null) {
			transaction.begin();
			manager.remove(emp);
			transaction.commit();
			return 1;
		} else {
			return 0;
		}
	}
	
	// to update employee details(name and phone number) based on ID
	public int updateEmployee(int id, String newName, long newPhone) {
		Employee emp = manager.find(Employee.class, id);
		if(emp!=null) {
			emp.setName(newName);
			emp.setPhone(newPhone);
			
			transaction.begin();
			manager.merge(emp);
			transaction.commit();
			
			return 1;
		} else {
			return 0;
		}
	}
	
	// to fetch all employee objects from DB
	public List<Employee> getAllEmployee(){
		Query q = manager.createQuery("select e from Employee e");
		List<Employee> list = q.getResultList();
		return list;
	}
	
}
