package com.empcompany.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Department
{
	private int departmentId;
	private String departmentName;
	private List<Employee> employees=new ArrayList<Employee>();
	private Organization organization;
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
