package com.supplier.service;

import java.util.Optional;

import com.supplier.model.WarehouseModel;

public interface WarehouseService {

	public WarehouseModel createWarehouse(Optional<WarehouseModel> optionalWarehouseModel);

	public WarehouseModel updateWarehouse(Optional<WarehouseModel> optionalWarehouseModel);

	public WarehouseModel deleteWarehouse(String warehouseGuid);

	public WarehouseModel findWarehouseByGuid(String warehouseGuid);

}
