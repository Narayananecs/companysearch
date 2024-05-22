package com.company.demo.bean;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class SearchResponse {
	
	  	private List<Item> items;
	  	private List<Item> officers;
		public List<Item> getItems() {
			return items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		public List<Item> getOfficers() {
			return officers;
		}
		public void setOfficers(List<Item> officers) {
			this.officers = officers;
		}
	  	
}
