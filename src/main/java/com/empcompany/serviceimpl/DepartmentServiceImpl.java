package com.empcompany.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empcompany.model.Department;
import com.empcompany.model.Employee;
import com.empcompany.model.Organization;
import com.empcompany.service.DepartmentService;
import com.empcompany.service.OrganizationService;


@Service
public class DepartmentServiceImpl implements DepartmentService 
{
	@Autowired
	OrganizationServiceImpl organizationservice;
	
	@Override
	public void addDepartment(Department department) 
	{
		int i=0;
		for(Organization org:organizationservice.organizations)
		{
			if(org.getOrganizationName().equals(department.getDepartmentName()))
			{
				organizationservice.organizations.get(i).getDepartments().add(department);
			}
			i++;
		}
	}

	@Override
	public void deleteEmployee(int departmentid) 
	{
//		for(Department dept:organization.getDepartments())
//		{
//			if(dept.getDepartmentId()==departmentid)
//			{
//				organization.getDepartments().remove(dept);		
//			}
//		}
	}

	@Override
	public List<List<Department>> displayDepartment() 
	{
		List<List<Department>> departments=new ArrayList<List<Department>>();
		for(Organization org:organizationservice.organizations)
		{
			departments.add(org.getDepartments());
		}
		return departments;
	}

	@Override
	public void updateDepartment(Department department) 
	{
		
		for(Organization org:organizationservice.organizations)
		{
			int i=0;
			if(org.getOrganizationName().equals(department.getDepartmentName()))
			{
			for(Department dept:org.getDepartments())
			{
				if(dept.getDepartmentId() ==department.getDepartmentId())
				{
					org.getDepartments().add(i,department);
				}
				i++;
			}
		}
		}
			
	}

}
