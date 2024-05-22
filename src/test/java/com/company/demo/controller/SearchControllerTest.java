package com.company.demo.controller;
import com.company.demo.bean.CompanyRequest;
import com.company.demo.bean.SearchResponse;
import com.company.demo.controller.SearchController;
import com.company.demo.service.SearchService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SearchController.class)
public class SearchControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SearchService searchService;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMethodName_ValidRequest() throws Exception {
        CompanyRequest request = new CompanyRequest();
        request.companyName = "Test Company";
        request.companyNumber = "12345";

        SearchResponse response = new SearchResponse();
        // populate response as needed

        when(searchService.getSearchResults(any(CompanyRequest.class))).thenReturn(ResponseEntity.ok(response));

        String requestJson = objectMapper.writeValueAsString(request);
        
        ResponseEntity<SearchResponse> res = searchService.getSearchResults(request);
        assertEquals(res.getStatusCode(), HttpStatusCode.valueOf(200));
    }

   
}