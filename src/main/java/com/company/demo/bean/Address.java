package com.company.demo.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)

public class Address{
    private String premises;
    private String postal_code;
    private String country;
    private String locality;
    private String address_line_1;
    private String region;
    private String address_line_2;
	public String getPremises() {
		return premises;
	}
	public void setPremises(String premises) {
		this.premises = premises;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getAddress_line_1() {
		return address_line_1;
	}
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAddress_line_2() {
		return address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
    
    
}