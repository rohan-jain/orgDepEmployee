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
	Organization organization;
	
	@Override
	public void addEmployee(Employee employee) 
	{
		for(Department department:organization.getDepartments())
		{
			if(department.getDepartmentName().equals(employee.getDepartment().getDepartmentName()))
			{
				Employee emp=EmployeeFactory.getEmployee(employee.getDepartment().getDepartmentName()).builder();
				emp.setId(department.getEmployees().isEmpty()?1:(department.getEmployees().get(department.getEmployees().size()-1).getId())+1);
				emp.setMobile(employee.getMobile()).setName(employee.getName()).setDepartment(employee.getDepartment());
				department.getEmployees().add(emp);
			}
		}
	}

	@Override
	public void deleteEmployee(Employee employee) 
	{
		int i=0;
		for(Department department:organization.getDepartments())
		{
			if(employee.getDepartment().getDepartmentName().equals(department.getDepartmentName()))
			{
			for(Employee emp:department.getEmployees())
			{
				if(emp.getId()==employee.getId())
				{
					organization.getDepartments().get(i).getEmployees().remove(emp);		
				}
			}
			i++;
		}
		}
	}

	@Override
	public List<Employee> displayEmployees() 
	{
		List<Employee> employees=new ArrayList<Employee>();
		for(Department dept:organization.getDepartments())
		{
			employees.addAll(dept.getEmployees());
		}
		return employees;
	}

//	@Override
//	public void updateEmployee(Employee employee)
//	{
//		int i=0;
//		for(Employee emp:department.getEmployees())
//		{
//			if(emp.getId() ==employee.getId())
//			{
//				department.getEmployees().add(i,emp);
//			}
//			i++;
//		}	
//	}

}
