package com.company.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.demo.bean.CompanyRequest;
import com.company.demo.bean.SearchResponse;
import com.company.demo.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/")
public class SearchController {
	
	@Autowired
	SearchService searchService;
	
	@PostMapping("company")
	public ResponseEntity<SearchResponse> getMethodName(@RequestBody CompanyRequest request) {
		
			return searchService.getSearchResults(request);
	}
	

}
