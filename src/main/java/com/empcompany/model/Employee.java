package com.empcompany.model;

import org.springframework.stereotype.Component;


@Component
public class Employee 
{
    protected int id;
    protected String name;
    protected String mobile;
    protected float Salary;
    protected float hours;
    protected float rate;
    
    public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	protected Department department;
    
	public int getId() {
		return id;
	}
	public Employee setId(int id) 
	{
		this.id = id;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public Employee setName(String name) 
	{
		this.name = name;
		return this;
	}
	
	public String getMobile() {
		return mobile;

	}
	
	public Employee setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
	
	public float getSalary() {
		return Salary;
	}
	
	public float getRate() {
		return rate;
	}
	
	public float getHours() 
	{
		return hours;
	}
	
	public void setHours()
	{}
	public void setRate()
	{}
    public void setSalary()
    {}
    public Employee builder()
    {
    	return this;
    }
    
}

