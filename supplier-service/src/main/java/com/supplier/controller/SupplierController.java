package com.supplier.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.supplier.model.SupplierModel;
import com.supplier.service.SupplierService;

@RestController
@RequestMapping("api/supplier/v1")
public class SupplierController {

	@Autowired
	public SupplierService supplierService;

	@PostMapping("/create")
	public SupplierModel createSupplier(@Validated @RequestBody SupplierModel supplierModel) {
		Optional<SupplierModel> optionalSupplierModel = Optional.ofNullable(supplierModel);
		return supplierService.createSupplier(optionalSupplierModel);
	}

	@GetMapping("/findByGuid")
	public SupplierModel findSupplierByGuid(@RequestParam("supplierGuid") String supplierGuid) {
		return supplierService.findSupplierByGuid(supplierGuid);
	}

}
