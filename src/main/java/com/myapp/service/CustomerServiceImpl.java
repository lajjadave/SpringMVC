package com.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.dao.Dao;
import com.myapp.model.Employee;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private Dao dao;
	
	@Override
	@Transactional
	public List<Employee> listAllEmployees() {
		return dao.listAllEmployees();
	}

	@Override
	@Transactional
	public void addEmployee(Employee emp) {
		System.out.println(emp.getEmail());
		dao.addEmployee(emp);
	}

	@Override
	@Transactional
	public Employee updateEmployee(int emp) {
		return dao.updateEmployee(emp);
		
	}

	@Override
	@Transactional
	public void deleteEmployee(int emp) {
		dao.deleteEmployee(emp);
		
	}

}
