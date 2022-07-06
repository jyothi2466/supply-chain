package com.supplier.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supplier.model.WarehouseModel;
import com.supplier.serviceimpl.WarehouseServiceImpl;

@RestController
@RequestMapping("api/supplier/warehouse/v1")
public class WarehouseController {

	@Autowired
	private WarehouseServiceImpl warehouseServiceImpl;

	@PostMapping("/create")
	public WarehouseModel createWarehouse(@Validated @RequestBody Optional<WarehouseModel> warehouseModel) {		
		return warehouseServiceImpl.createWarehouse(warehouseModel);
	}
}
