package com.empcompany.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empcompany.model.Organization;
import com.empcompany.service.OrganizationService;


@Service
public  class OrganizationServiceImpl implements OrganizationService 
{
	List<Organization> organizations;
	
	@Override
	public void addOrganization(Organization organization)
	{
		organizations.add(organization);
	}

	@Override
	public void deleteOrganization(int organizationid) 
	{
		for(Organization org:organizations)
		{
			if(org.getOrganizationId()==organizationid)
			{
				organizations.remove(org);
			}
		}
	}

	@Override
	public List<Organization> displayOrganization() 
	{
		return organizations;
	}

	@Override
	public void updateOrganization(Organization organization) 
	{
		int i=0;
		for(Organization org:organizations)
		{
			if(org.getOrganizationId()==organization.getOrganizationId())
			{
				organizations.add(i,organization);
			}
			i++;
		}
	}
}
