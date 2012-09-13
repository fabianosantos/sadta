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
	
	public List<Employee> listEmployee() {
		return employeeDao.listAll();
	}
	
	public void saveEmployee(Employee employee) {
		employeeDao.saveOrUpdate(employee);
		result.forwardTo(EmployeeController.class).listEmployee();
	}
	
}
