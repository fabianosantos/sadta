package com.tenshiarts.sadta.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.util.hibernate.extra.Load;
import br.com.caelum.vraptor.validator.Validations;

import com.tenshiarts.sadta.dao.EmployeeDao;
import com.tenshiarts.sadta.persistence.Employee;

@Resource
public class EmployeeController {

	private EmployeeDao employeeDao;
	private Result result;
	private Validator validator;
	
	public EmployeeController(EmployeeDao employeeDao, Result result, Validator validator) {
		this.employeeDao = employeeDao;
		this.result = result;
		this.validator = validator;
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
	
	public void saveEmployee(final Employee employee) {
		validator.checking(new Validations() { {
            that(employee.getName() != null && !"".equals(employee.getName()), "employee.name", "empty.name");
        } });
        validator.onErrorUsePageOf(EmployeeController.class).registerEmployee();
		employeeDao.saveOrUpdate(employee);
		result.redirectTo(EmployeeController.class).listEmployee();
	}
	
}
