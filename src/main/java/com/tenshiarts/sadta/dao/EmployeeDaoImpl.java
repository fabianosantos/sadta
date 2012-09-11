package com.tenshiarts.sadta.dao;

import java.util.ArrayList;
import java.util.List;

import com.tenshiarts.sadta.persistence.Employee;

public class EmployeeDaoImpl {
	
	List<Employee> employees;
	
	public EmployeeDaoImpl() {
		super();
		employees = new ArrayList<Employee>();
	}
	
	public Employee findById(Long id) {
		for(Employee employee : employees) {
			if(employee.getId().equals(id))
				return employee;
		}
		return null;
	}
	
	public List<Employee> listAll() {
		return employees;
	}
	
	public void saveOrUpdate(Employee employee) {
		employee.setId(employees.size()+1L);
		employees.add(employee);
	}
}
