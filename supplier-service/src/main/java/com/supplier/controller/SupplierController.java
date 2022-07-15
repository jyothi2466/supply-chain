package com.supplier.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.supplier.model.SupplierModel;
import com.supplier.service.SupplierService;

@RestController
@RequestMapping("/api/supplier/v1")
public class SupplierController {
	private final Logger logger = LoggerFactory.getLogger(SupplierController.class);

	@Autowired
	private SupplierService supplierService;

	@PostMapping("/create")
	public SupplierModel createSupplier(@Validated @RequestBody Optional<SupplierModel> optionalSupplierModel) {
		logger.info("**************SupplierController-createSupplier()**************");
		logger.info("RequestBody------->"+optionalSupplierModel.get());
		
		return supplierService.createSupplier(optionalSupplierModel);
	}

	@GetMapping("/findByGuid")
	public SupplierModel findSupplierByGuid(@RequestParam("supplierGuid") String supplierGuid) {
		return supplierService.findSupplierByGuid(supplierGuid);
	}

	@PutMapping("/update")
	public SupplierModel updateSupplier(@RequestBody Optional<SupplierModel> optionalSupplierModel) {
		return supplierService.updateSupplier(optionalSupplierModel);

	}

	@DeleteMapping("/delete")
	public void deleteSupplier(@RequestParam("supplierGuid") String supplierGuid) {
		 supplierService.deleteSupplier(supplierGuid);

	}
}
