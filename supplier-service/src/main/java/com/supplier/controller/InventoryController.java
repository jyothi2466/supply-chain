package com.supplier.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supplier.model.InventoryModel;
import com.supplier.serviceimpl.InventoryServiceImpl;

@RestController
@RequestMapping("api/supplier/inventory/v1")
public class InventoryController {

	@Autowired
	private InventoryServiceImpl inventoryServiceImpl;

	public InventoryModel createInventory(Optional<InventoryModel> optionalInventoryModel) {
		return inventoryServiceImpl.createInventory(optionalInventoryModel);

	}
}
