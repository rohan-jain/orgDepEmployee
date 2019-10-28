package com.empcompany.model;

public class HREmployee extends Employee
{

	@Override
	public void setHours() 
	{
		this.hours=9;
	}

	@Override
	public void setRate() 
	{
		this.rate=9.23f;
	}

	@Override
	public void setSalary() 
	{
		this.Salary=this.rate*this.hours;
	}

	@Override
	public Employee builder() 
	{
		this.setHours();
		this.setRate();
		this.setSalary();
		return super.builder();
	}
	
	
}
