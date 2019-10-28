package com.empcompany.service;

import java.util.List;

import com.empcompany.model.Organization;

public interface OrganizationService 
{
	public void addOrganization(Organization organization);
	public void deleteOrganization(int organizationid);
	public List<Organization> displayOrganization();
	public void updateOrganization(Organization organization);
}
