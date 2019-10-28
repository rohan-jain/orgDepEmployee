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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empcompany.model.Department;
import com.empcompany.service.DepartmentService;
import com.empcompany.serviceimpl.DepartmentServiceImpl;

@RestController
@RequestMapping("department")
public class DepartmentController
{
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> m1(@RequestBody Department department)
	{
		departmentService.addDepartment(department);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<Department>>  getDepartmentDetails() 
	{
		return new ResponseEntity<List<Department>>(departmentService.displayDepartment(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{departmentId}")
	public ResponseEntity<Void> deleteDetails(@PathVariable("departmentId") int departmentId) 
	{
		departmentService.deleteDepartment(departmentId);
		return new ResponseEntity<Void>(HttpStatus.OK);		
	}
}
