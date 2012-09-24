package com.tenshiarts.sadta.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;

import com.tenshiarts.sadta.dao.EmployeeDao;
import com.tenshiarts.sadta.persistence.Employee;
import com.tenshiarts.sadta.util.HibernateUtil;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	private static List<Employee> employees;
	
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
	
	@SuppressWarnings("unchecked")
	public List<Employee> listAll() {
		Session session = HibernateUtil.getSession();
		Criteria criteria = session.createCriteria(getClass());
		return (List<Employee>) criteria.list();
	}
	
	public void saveOrUpdate(Employee employee) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		employee.setName(employee.getName().toUpperCase());
		session.save(employee);
		tx.commit();
	}
	
	/*public void saveOrUpdate(Employee employee) {
		employee.setId(employees.size()+1L);
		employee.setName(employee.getName().toUpperCase());
		employees.add(employee);
	}*/
}
