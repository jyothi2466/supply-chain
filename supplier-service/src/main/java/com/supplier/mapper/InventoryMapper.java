package com.supplier.mapper;

import org.mapstruct.Mapper;

import com.supplier.entity.Inventory;
import com.supplier.entity.Offer;
import com.supplier.entity.StockLevel;
import com.supplier.entity.WarehouseProduct;
import com.supplier.model.InventoryModel;
import com.supplier.model.OfferModel;
import com.supplier.model.StockLevelModel;
import com.supplier.model.WarehouseProductModel;

@Mapper(componentModel = "spring")
public interface InventoryMapper {

	public InventoryModel inventoryToModel(Inventory inventory);

	public Inventory modelToInventory(InventoryModel inventoryModel);

	public WarehouseProduct modelToWarehouseProduct(WarehouseProductModel warehouseProductModel);

	public WarehouseProductModel warehouseProductToModel(WarehouseProduct warehouseProduct);

	public OfferModel offerToModel(Offer offer);

	public Offer modelToOffer(OfferModel offerModel);

	public StockLevelModel stockLevelToModel(StockLevel stockLevel);

	public StockLevel modelToStockLevel(StockLevelModel stockLevelModel);

}
