package com.supplier.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.supplier.entity.Supplier;
import com.supplier.model.SupplierModel;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
	
	@Mapping(target="supplierGuid", source="supplierGuid")
	@Mapping(target="registrationNumber", source="registrationNumber")
	@Mapping(target="supplierCode", source="supplierCode")
	@Mapping(target="companyName", source="companyName")
	public Supplier modelToSupplier(SupplierModel supplierModel);
	
	@Mapping(target="supplierGuid", source="supplierGuid")
	@Mapping(target="registrationNumber", source="registrationNumber")
	@Mapping(target="supplierCode", source="supplierCode")
	@Mapping(target="companyName", source="companyName")
	public SupplierModel supplierToModel(Supplier supplier);
}
