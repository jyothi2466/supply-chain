package com.supplier.test.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.supplier.SupplierServiceApplication;
import com.supplier.model.SupplierModel;
import com.supplier.repository.SupplierRepository;
import com.supplier.serviceimpl.SupplierServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK, classes = { SupplierServiceApplication.class })
public class SupplierControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@MockBean
	private SupplierServiceImpl supplierService;
	
	@MockBean
	private SupplierRepository supplierRepository;

	@Before
	public void setUp() {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();		
	}

	@Test
	public void shouldReturnDefaultMessage() throws JsonProcessingException, Exception {
		SupplierModel supplierModel = new SupplierModel();
		supplierModel.setSupplierGuid("SPGUID100");
		supplierModel.setCompanyName("APPLO");
		supplierModel.setRegistrationNumber("12345678");
		supplierModel.setSupplierCode("SPCODE100");
		when(supplierService.createSupplier(Optional.ofNullable(any(SupplierModel.class)))).thenReturn(supplierModel);	
		
		mockMvc.perform(post("/api/supplier/v1/create")
				   .contentType(MediaType.APPLICATION_JSON)
				   .content(asJsonString(supplierModel))						
				   .accept(MediaType.APPLICATION_JSON))

			  
				   .andExpect(content().contentType(MediaType.APPLICATION_JSON))				 
				   .andExpect(jsonPath("$.supplierGuid").value("SPGUID100"));		
	}

	 public static String asJsonString(final SupplierModel supplierModel) {
	        try {
	            final ObjectMapper mapper = new ObjectMapper();
	            final String jsonContent = mapper.writeValueAsString(supplierModel);
	            System.out.println(jsonContent);
	            return jsonContent;
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
}
