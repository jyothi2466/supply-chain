package com.supplier.serviceimpl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.supplier.mapper.WarehouseMapper;
import com.supplier.model.WarehouseModel;
import com.supplier.repository.WarehouseRepoistory;
import com.supplier.service.WarehouseService;
import com.supplier.util.WarehouseUtil;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	private WarehouseMapper warehouseMapper;

	private WarehouseRepoistory warehouseRepoistory;

	public WarehouseServiceImpl(WarehouseMapper warehouseMapper, WarehouseRepoistory warehouseRepoistory) {
		super();
		this.warehouseMapper = warehouseMapper;
		this.warehouseRepoistory = warehouseRepoistory;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public WarehouseModel createWarehouse(Optional<WarehouseModel> optionalWarehouseModel) {
		return warehouseMapper.warehouseToModel(
				warehouseRepoistory.save(WarehouseUtil.mapModelToWarehouse(optionalWarehouseModel, warehouseMapper)));
	}

	@Override
	public WarehouseModel updateWarehouse(Optional<WarehouseModel> optionalWarehouseModel) {

		return null;
	}

	@Override
	public WarehouseModel findWarehouseByGuid(String warehouseGuid) {

		return null;
	}

	@Override
	public WarehouseModel deleteWarehouse(String warehouseGuid) {

		return null;
	}
}
