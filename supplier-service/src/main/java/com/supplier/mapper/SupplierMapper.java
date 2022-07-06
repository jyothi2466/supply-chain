package com.supplier.mapper;

import org.mapstruct.Mapper;

import com.supplier.entity.Supplier;
import com.supplier.model.SupplierModel;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

	public Supplier modelToSupplier(SupplierModel supplierModel);

	public SupplierModel supplierToModel(Supplier supplier);

}
