package com.supplier.service;

import java.util.Optional;

import com.supplier.model.InventoryModel;

public interface InventoryService {

	public InventoryModel createInventory(Optional<InventoryModel> optionalInventory);

}
