package com.jsp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.Dao.EmployeeDao;
import com.jsp.Dto.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;
	
	// Handler method to insert an object into DB
	
	// this method will take us to create.jsp along with employee object
	@RequestMapping("/add")
	public ModelAndView getEmployeeForm() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("create");
		return mv;
	}
	
	
	// this method accepts the employee object, sends it to DAO class for processing
	// and return response as String
		
	@RequestMapping("/save")
	@ResponseBody
	public String saveEmployee(@ModelAttribute Employee employee) {
		String msg = dao.insertEmployee(employee);
		return msg;
	}
	
	
	// Handler method to search for an employee object based on ID
	@RequestMapping("/search")
	public String getSearchForm() {
		return "search";
	}
	
	@RequestMapping("/view")
	public ModelAndView getEmployeeDetails(@RequestParam int id) { // RequestParam is used to fetch value from the id 
		Employee emp = dao.getEmployeeById(id);
		
		if(emp!=null){
			ModelAndView mv = new ModelAndView();
			mv.addObject("employee", emp);
			mv.setViewName("display");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("errormsg","EMPLOYEE ID DOESN'T EXIST...");
			mv.setViewName("error");
			return mv;
		}
	}
	
	@RequestMapping("/delete")
	public String getDeleteForm() {
		return "delete";
	}
	
	
	@RequestMapping("/remove")
	public ModelAndView checkIfDeleted(@RequestParam int id) {
		int result = dao.deleteEmployeeById(id);
		if(result==1) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("employee","EMPLOYEE DETAILS OF ID : "+id+" HAVE BEEN DELETED SUCCESSFULLY...");
			mv.setViewName("success");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("errormsg","EMPLOYEE ID "+id+" DOESN'T EXIST...");
			mv.setViewName("error");
			return mv;
		}
	}
	
	@RequestMapping("/edit")
	public String getUpdateForm() {
		return "update";
	}
	
	@RequestMapping("/update")
	public ModelAndView updateEmployee(@RequestParam int id, @RequestParam String name, @RequestParam long phone){
		int res = dao.updateEmployee(id, name, phone);
		if(res==1) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("employee", "EPLOYEE DETAILS OF ID : "+id+" ARE UPDATED SUCCESSFULLY");
			mv.setViewName("success");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("errormsg","EMPLOYEE ID : "+id+" DOESN'T EXIST");
			mv.setViewName("error");
			return mv;
		}
	}
	
	// Handler method to retreive all employees objects from DB
	@RequestMapping("/get")
	public ModelAndView displayAllEmployees() {
		List<Employee> list = dao.getAllEmployee();
		
		if(!list.isEmpty() && list !=null) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("employeeList", list);
			mv.setViewName("displayAll");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("errormsg","THERE ARE NO EMPLOYEE DETAILS IN DATABASE...");
			mv.setViewName("error");
			return mv;
		}
	}
	
	
	
	
}
