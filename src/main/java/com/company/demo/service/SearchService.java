package com.company.demo.service;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;

import com.company.demo.bean.CompanyRequest;
import com.company.demo.bean.CompanyResponse;
import com.company.demo.bean.Item;
import com.company.demo.bean.SearchResponse;

import reactor.core.publisher.Mono;

@Service
public class SearchService {

	public Mono<CompanyResponse> getCompanyDetails(String searchString) {

		String baseURI = "https://exercise.trunarrative.cloud/TruProxyAPI/rest/Companies/v1/";

		WebClient webClient = WebClient.create(baseURI);

		Mono<CompanyResponse> response = webClient.get()
				.uri(searchString)
				.header("x-api-key", "PwewCEztSW7XlaAKqkg4IaOsPelGynw6SN9WsbNf")
				.retrieve()
				.bodyToMono(CompanyResponse.class);

		return response;
	}

	public ResponseEntity<SearchResponse> getSearchResults(CompanyRequest request) {
		ResponseEntity<SearchResponse> result =  null;
		try {

			String param  = !StringUtils.isEmpty(request.companyNumber) ? request.companyNumber : request.companyName ;

			SearchResponse searchResp = new SearchResponse();

			StringBuilder searchString = new StringBuilder();

			searchString.append("Search?Query="+param);

			CompanyResponse resp =  getCompanyDetails(searchString.toString()).block();

			Predicate<Item> predicateFunc = e -> e.getTitle().equalsIgnoreCase(request.companyName);;

			if(!StringUtils.isEmpty(request.companyNumber)) {

				predicateFunc = e -> e.getCompany_number().equalsIgnoreCase(request.companyNumber);

			}
			Optional<Item> company = Optional.ofNullable(resp.getItems().stream().
					filter(predicateFunc).findFirst().get());

			if (company.isPresent() && StringUtils.hasText(company.get().getCompany_number())) {


				Predicate<Item> activeFilter = e -> !StringUtils.isEmpty(e.getResigned_on());

				if(request.active) {
					activeFilter = e -> StringUtils.isEmpty(e.getResigned_on());
				}


				searchResp.setItems(Arrays.asList(company.get()));

				CompanyResponse ofr ;

				searchString.delete(0, searchString.length());

				searchString.append("Officers?CompanyNumber="+company.get().getCompany_number());

				ofr = getCompanyDetails(searchString.toString()).block();

				searchResp.setOfficers(ofr.getItems().stream().filter(activeFilter).collect(Collectors.toList()));
				result = new ResponseEntity(searchResp,HttpStatus.OK);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			result = new ResponseEntity("failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;

	}

}


