package com.supplier.service;

import java.util.Optional;

import com.supplier.model.SupplierModel;

public interface SupplierService {

	public SupplierModel createSupplier(Optional<SupplierModel> optionalSupplierModel);
	
	public SupplierModel findSupplierByGuid(String supplierGuid);

}
