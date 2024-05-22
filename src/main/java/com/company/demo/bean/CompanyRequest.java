package com.company.demo.bean;

import jakarta.validation.constraints.NotNull;

public class CompanyRequest {
	
	@NotNull
	public String companyName;
	
	public String companyNumber;
	
	@NotNull
	public boolean active;
	
	

}
