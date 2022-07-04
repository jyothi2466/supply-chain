package com.supplier.mapper;

import org.mapstruct.Mapper;

import com.supplier.entity.Supplier;
import com.supplier.entity.Warehouse;
import com.supplier.model.SupplierModel;
import com.supplier.model.WarehouseModel;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

	public Supplier modelToSupplier(SupplierModel supplierModel);

	public SupplierModel supplierToModel(Supplier supplier);

	public Warehouse modelToEntity(WarehouseModel warehouseModel);

	public WarehouseModel entityToModel(Warehouse warehouse);
}
