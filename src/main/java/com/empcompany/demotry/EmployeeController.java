package com.empcompany.demotry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empcompany.model.Employee;
import com.empcompany.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController
{
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> m1(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<Employee>> getEmployeeDetails() 
	{
		return new ResponseEntity<List<Employee>>(employeeService.displayEmployees(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteEmployeeDetails(@RequestBody Employee employee) 
	{
		employeeService.deleteEmployee(employee);
		return new ResponseEntity<Void>(HttpStatus.OK);		
	}
}
