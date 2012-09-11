package com.tenshiarts.sadta.controller;

import java.util.List;

import com.tenshiarts.sadta.dao.EmployeeDaoImpl;
import com.tenshiarts.sadta.persistence.Employee;

public class EmployeeController {

	private EmployeeDaoImpl employeeDao;
	private Employee employee;
	private String id;
	private List<Employee> employees;
	
	public String findEmployee() {
		employee = employeeDao.findById(new Long(id));
		return "success";
	}
	
	public String listAll() {
		employees = employeeDao.listAll();
		return "success";
	}
	
	public String save() {
		employeeDao.saveOrUpdate(employee);
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

	public void setId(String id) {
		this.id = id;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void setEmployeeDao(EmployeeDaoImpl employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
