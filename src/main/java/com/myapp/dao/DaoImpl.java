package com.myapp.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.myapp.model.Employee;

@Repository
public class DaoImpl implements Dao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Employee> listAllEmployees() {
		Session session = sessionFactory.getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee",Employee.class);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public void addEmployee(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(emp);
	}

	@Override
	public Employee updateEmployee(int emp) {
		Session session = sessionFactory.getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee where id = :id",Employee.class);
		query.setParameter("id", emp);
		Employee employee = query.getSingleResult();
		return employee;
		
		
	}

	@Override
	public void deleteEmployee(int emp) {
		Session session = sessionFactory.getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee where id = :id",Employee.class);
		query.setParameter("id", emp);
		Employee employee = query.getSingleResult();
		session.delete(employee);
		
	}
	
}
