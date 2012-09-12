package com.tenshiarts.sadta.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.util.hibernate.extra.Load;

import com.tenshiarts.sadta.dao.EmployeeDao;
import com.tenshiarts.sadta.persistence.Employee;

@Resource
public class EmployeeController {

	private EmployeeDao employeeDao;
	private Employee employee;
	private String id;
	private List<Employee> employees;
	private Result result;
	
	public EmployeeController(Result result, EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		this.result = result;
	}
	
	@Path("/")
	public void index() {
		
	}
	
	public void registerEmployee() {
	}
	
	public Employee findEmployee(@Load Employee employee) {
		return employee;
	}
	
	public String listAll() {
		employees = employeeDao.listAll();
		return "success";
	}
	
	public String saveEmployee(Employee employee) {
		employeeDao.saveOrUpdate(employee);
		result.forwardTo(EmployeeController.class).listAll();
		return "success";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getId() {
		return id;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
}
