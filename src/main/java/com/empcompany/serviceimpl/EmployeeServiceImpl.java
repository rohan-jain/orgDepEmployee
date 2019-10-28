package com.empcompany.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empcompany.factory.EmployeeFactory;
import com.empcompany.model.Department;
import com.empcompany.model.Employee;
import com.empcompany.model.Organization;
import com.empcompany.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	Department department;
	
	@Override
	public void addEmployee(Employee employee) 
	{
		Employee emp=EmployeeFactory.getEmployee(employee.getDepartment().getDepartmentName()).builder();
		emp.setId(department.getEmployees().isEmpty()?1:(department.getEmployees().get(department.getEmployees().size()-1).getId())+1);
		emp.setMobile(employee.getMobile()).setName(employee.getName()).setDepartment(employee.getDepartment());
		department.getEmployees().add(emp);
	}

	@Override
	public void deleteEmployee(int employeeid) 
	{
		for(Employee emp:department.getEmployees())
		{
			if(emp.getId()==employeeid)
			{
				department.getEmployees().remove(emp);		
			}
		}
	}

	@Override
	public List<Employee> displayEmployees() 
	{
		return department.getEmployees();
	}

	@Override
	public void updateEmployee(Employee employee)
	{
		int i=0;
		for(Employee emp:department.getEmployees())
		{
			if(emp.getId() ==employee.getId())
			{
				department.getEmployees().add(i,emp);
			}
			i++;
		}	
	}

}
