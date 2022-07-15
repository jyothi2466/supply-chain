package com.supplier.util;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.supplier.entity.Inventory;
import com.supplier.entity.Offer;
import com.supplier.entity.StockLevel;
import com.supplier.entity.WarehouseProduct;
import com.supplier.exception.SupplierNotFoundException;
import com.supplier.mapper.InventoryMapper;
import com.supplier.model.InventoryModel;
import com.supplier.model.OfferModel;
import com.supplier.model.StockLevelModel;
import com.supplier.model.WarehouseProductModel;

public class InventoryUtil {

	public static Inventory mapModelToInventory(Optional<InventoryModel> optionalInventoryModel,
			InventoryMapper inventoryMapper) {

		InventoryModel inventoryModel = optionalInventoryModel
				.orElseThrow(() -> new SupplierNotFoundException(SupplierConstant.inventoryErrorMessage));

		Inventory inventory = inventoryMapper.modelToInventory(inventoryModel);
		inventory.setInventoryGuid(UUID.randomUUID().toString());

		List<WarehouseProduct> warehouseProductsList = optionalInventoryModel
				.map(InventoryModel::getWarehouseProductModels)
				.orElseThrow(() -> new SupplierNotFoundException("Warehouse details not found")).stream()
				.map(warehouseProductModel -> mapModelToWarehouseProduct(warehouseProductModel, inventoryMapper,
						optionalInventoryModel))
				.collect(Collectors.toList());

		inventory.setWarehouseProducts(warehouseProductsList);

		return inventory;

	}

	public static WarehouseProduct mapModelToWarehouseProduct(WarehouseProductModel warehouseProductModel,
			InventoryMapper inventoryMapper, Optional<InventoryModel> optionalInventoryModel) {

		warehouseProductModel.setProductGuid(UUID.randomUUID().toString());

		List<WarehouseProductModel> warehouseProductModels = optionalInventoryModel
				.map(InventoryModel::getWarehouseProductModels)
				.orElseThrow(() -> new SupplierNotFoundException("no data"));

		Offer offer = (Offer) warehouseProductModels.stream()
				.map(warehouseProductModel1 -> mapModelToOffer(warehouseProductModel1, inventoryMapper));

		WarehouseProduct warehouseProduct = new WarehouseProduct();
		warehouseProduct.setOffer(offer);

		StockLevel stockLevel = (StockLevel) warehouseProductModels.stream()
				.map(warehouseProductModel2 -> mapModelToStockLevel(warehouseProductModel, inventoryMapper));

		warehouseProduct.setStockLevel(stockLevel);
		return warehouseProduct;

	}

	public static Offer mapModelToOffer(WarehouseProductModel warehouseProductModel, InventoryMapper inventoryMapper) {

		OfferModel offerModel = warehouseProductModel.getOfferModel();

		offerModel.setOfferGuid(UUID.randomUUID().toString());
		return inventoryMapper.modelToOffer(offerModel);
	}

	public static StockLevel mapModelToStockLevel(WarehouseProductModel warehouseProductModel,
			InventoryMapper inventoryMapper) {

		StockLevelModel stockLevelModel = warehouseProductModel.getStockLevelModel();
		stockLevelModel.setStockLevelGuid(UUID.randomUUID().toString());

		return inventoryMapper.modelToStockLevel(stockLevelModel);

	}

}
