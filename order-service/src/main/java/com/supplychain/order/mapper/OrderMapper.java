package com.supplychain.order.mapper;

import org.mapstruct.Mapper;

import com.supplychain.order.entities.LineItem;
import com.supplychain.order.entities.Order;
import com.supplychain.order.entities.OrderStoreSupplier;
import com.supplychain.order.model.LineItemModel;
import com.supplychain.order.model.OrderModel;
import com.supplychain.order.model.OrderStoreSupplierModel;

@Mapper(componentModel = "Spring")
public interface OrderMapper {

	public OrderModel orderToModel(Order order);

	public Order modelToOrder(OrderModel orderModel);
	
	public LineItem modelToLineItem(LineItemModel lineItemModel);
	
	public LineItemModel lineItemToModel(LineItem lineItem);
	
	public OrderStoreSupplier modelToOrderStoreSupplier(OrderStoreSupplierModel orderStoreSupplierModel);

	public OrderStoreSupplierModel orderStoreSupplierToModel(OrderStoreSupplier orderStoreSupplier);
}
