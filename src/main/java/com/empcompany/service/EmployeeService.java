package com.empcompany.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.empcompany.model.Employee;


public interface EmployeeService
{
	public void addEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public List<Employee> displayEmployees();
//	public void updateEmployee(Employee employee);
}
