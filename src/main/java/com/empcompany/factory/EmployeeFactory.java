package com.empcompany.factory;

import com.empcompany.model.Employee;
import com.empcompany.model.HREmployee;
import com.empcompany.model.SalesEmployee;

public class EmployeeFactory
{
	public static Employee getEmployee(String departmentName)
	{
		if(departmentName.equals("hr"))
		{
			return new HREmployee();
		}
		else if(departmentName.equals("sales"))
		{
			return new SalesEmployee();
		}
		else
		{
			return null;
		}
	}
}
