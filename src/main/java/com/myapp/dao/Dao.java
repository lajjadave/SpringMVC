package com.myapp.dao;

import java.util.List;

import com.myapp.model.Employee;

public interface Dao {

	List<Employee> listAllEmployees();

	void addEmployee(Employee emp);

	Employee updateEmployee(int emp);

	void deleteEmployee(int emp);
}
