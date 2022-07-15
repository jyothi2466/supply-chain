package com.supplier.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplier.mapper.InventoryMapper;
import com.supplier.model.InventoryModel;
import com.supplier.repository.InventoryRepository;
import com.supplier.service.InventoryService;
import com.supplier.util.InventoryUtil;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryMapper inventoryMapper;
	@Autowired
	private InventoryRepository inventoryRepository;

	public InventoryModel createInventory(Optional<InventoryModel> optionalInventoryModel) {

		return inventoryMapper.inventoryToModel(
				inventoryRepository.save(InventoryUtil.mapModelToInventory(optionalInventoryModel, inventoryMapper)));
	}

}
