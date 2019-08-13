package com.example.service;

import java.util.List;

import com.example.bean.Employee;

public interface EmployeeService {

	public void createEmployee(Employee employee);

	public List<Employee> getEmployee();

	public Employee findById(int id);

	public void update(Employee employee);

	public void deleteEmployeeById(int id);

	public Employee updateEmployeePartial(Employee employee, int id);
}
