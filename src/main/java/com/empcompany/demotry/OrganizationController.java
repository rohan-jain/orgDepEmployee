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

import com.empcompany.model.Department;
import com.empcompany.model.Organization;
import com.empcompany.service.DepartmentService;

@RestController
@RequestMapping("organization")
public class OrganizationController 
{
	@Autowired
	Organization organization;
	
	
	@GetMapping("/show")
	public ResponseEntity<Organization>  getOrganizationDetails() 
	{
		return new ResponseEntity<Organization>(organization,HttpStatus.OK);
	}
	

}
