package com.supplier.serviceimpl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.supplier.entity.Warehouse;
import com.supplier.mapper.SupplierMapper;
import com.supplier.model.WarehouseModel;
import com.supplier.repository.WarehouseRepoistory;
import com.supplier.service.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	@Autowired
	private SupplierMapper supplierMapper;

	@Autowired
	private WarehouseRepoistory warehouseRepoistory;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public WarehouseModel createWarehouse(Optional<WarehouseModel> optionalWarehouseModel) {
		if (optionalWarehouseModel.isPresent()) {
			WarehouseModel warehouseModel = optionalWarehouseModel.get();
			warehouseModel.setWarehouseGuid(UUID.randomUUID().toString());
			Warehouse warehouse = warehouseRepoistory.save(supplierMapper.modelToEntity(warehouseModel));
			warehouseModel = supplierMapper.entityToModel(warehouse);
			return warehouseModel;
		} else {
			throw new RuntimeException("Should not be null");
		}
	}
}
