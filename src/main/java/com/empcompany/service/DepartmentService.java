package com.empcompany.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.empcompany.model.Department;

public interface DepartmentService 
{
	public void addDepartment(Department department);
	public void deleteDepartment(int departmentid);
	public List<Department>  displayDepartment();
	public void updateDepartment(Department department);
}
