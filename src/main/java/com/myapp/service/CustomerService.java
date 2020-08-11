package com.myapp.service;

import java.util.List;

import com.myapp.model.Employee;

public interface CustomerService {

	public List<Employee> listAllEmployees();

	public void addEmployee(Employee emp);

	public Employee updateEmployee(int emp);

	public void deleteEmployee(int emp);
}
