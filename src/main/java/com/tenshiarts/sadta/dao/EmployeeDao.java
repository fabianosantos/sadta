package com.tenshiarts.sadta.dao;

import java.util.List;

import com.tenshiarts.sadta.persistence.Employee;

public interface EmployeeDao {
	public Employee findById(Long id);
	public List<Employee> listAll();
	public void saveOrUpdate(Employee employee);
}
