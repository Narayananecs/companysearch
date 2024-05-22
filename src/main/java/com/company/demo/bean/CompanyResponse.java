package com.company.demo.bean;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)

public class CompanyResponse{
	
	public CompanyResponse() {}
	
    private int page_number;
    
    private String kind;
    
    private int total_results;
    
    private ArrayList<Item> items;
	
    public int getPage_number() {
		return page_number;
	}
	public void setPage_number(int page_number) {
		this.page_number = page_number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getTotal_results() {
		return total_results;
	}
	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}


class Links{
    private String self;

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}
    
}


