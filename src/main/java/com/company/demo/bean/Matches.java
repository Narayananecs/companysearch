package com.company.demo.bean;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class Matches{
    private ArrayList<Integer> title;
    
    private ArrayList<Integer> snippet;
    
    public ArrayList<Integer> getTitle() {
		return title;
	}
	public void setTitle(ArrayList<Integer> title) {
		this.title = title;
	}
	public ArrayList<Integer> getSnippet() {
		return snippet;
	}
	public void setSnippet(ArrayList<Integer> snippet) {
		this.snippet = snippet;
	}
}