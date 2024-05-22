package com.company.demo.bean;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class Item{
    private String company_status;
    private String address_snippet;
    private String date_of_creation;
    private Matches matches;
    private String description;
    private Links links;
    private String company_number;
    @JsonProperty("title")
    private String title;
    private String company_type;
    private Address address;
    private String kind;
    private ArrayList<String> description_identifier;
    private String date_of_cessation;
    private String snippet;
    
    
    private String name;
    private String appointed_on;
    private String officer_role;
    private String resigned_on;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAppointed_on() {
		return appointed_on;
	}
	public void setAppointed_on(String appointed_on) {
		this.appointed_on = appointed_on;
	}
	public String getOfficer_role() {
		return officer_role;
	}
	public void setOfficer_role(String officer_role) {
		this.officer_role = officer_role;
	}
	public String getResigned_on() {
		return resigned_on;
	}
	public void setResigned_on(String resigned_on) {
		this.resigned_on = resigned_on;
	}
	private String getCompany_status() {
		return company_status;
	}
	public void setCompany_status(String company_status) {
		this.company_status = company_status;
	}
	public String getAddress_snippet() {
		return address_snippet;
	}
	public void setAddress_snippet(String address_snippet) {
		this.address_snippet = address_snippet;
	}
	public String getDate_of_creation() {
		return date_of_creation;
	}
	public void setDate_of_creation(String date_of_creation) {
		this.date_of_creation = date_of_creation;
	}
	public Matches getMatches() {
		return matches;
	}
	public void setMatches(Matches matches) {
		this.matches = matches;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public String getCompany_number() {
		return company_number;
	}
	public void setCompany_number(String company_number) {
		this.company_number = company_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public ArrayList<String> getDescription_identifier() {
		return description_identifier;
	}
	public void setDescription_identifier(ArrayList<String> description_identifier) {
		this.description_identifier = description_identifier;
	}
	public String getDate_of_cessation() {
		return date_of_cessation;
	}
	public void setDate_of_cessation(String date_of_cessation) {
		this.date_of_cessation = date_of_cessation;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
    
    
}