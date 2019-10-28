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

import com.empcompany.model.Organization;
import com.empcompany.service.OrganizationService;

@RestController
@RequestMapping("organization")
public class OrganizationController
{
	@Autowired
	OrganizationService organizationService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> m1(@RequestBody Organization organization)
	{
		organizationService.addOrganization(organization);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<Organization>> getOrganizationDetails() 
	{
		return new ResponseEntity<List<Organization>>(organizationService.displayOrganization(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteOrganizationDetails(@PathVariable("id") int organizationid) 
	{
		organizationService.deleteOrganization(organizationid);
		return new ResponseEntity<Void>(HttpStatus.OK);		
	}
	
}
