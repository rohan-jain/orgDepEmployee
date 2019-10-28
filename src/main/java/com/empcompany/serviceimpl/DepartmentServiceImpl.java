package com.empcompany.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empcompany.model.Department;
import com.empcompany.model.Organization;
import com.empcompany.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService 
{
	@Autowired
	Organization organization;
	
	@Override
	public void addDepartment(Department department) 
	{
		organization.getDepartments().add(department);
	}

	@Override
	public void deleteDepartment(int departmentid) 
	{
		for(Department dept:organization.getDepartments())
		{
			if(dept.getDepartmentId()==departmentid)
			{
				organization.getDepartments().remove(dept);		
			}
		}
	}

	@Override
	public List<Department> displayDepartment() 
	{
		return organization.getDepartments();
	}

	@Override
	public void updateDepartment(Department department) 
	{
		int i=0;
		for(Department dept:organization.getDepartments())
		{
			if(dept.getDepartmentId() ==department.getDepartmentId())
			{
				organization.getDepartments().add(i,department);
			}
			i++;
		}	
	}

}
