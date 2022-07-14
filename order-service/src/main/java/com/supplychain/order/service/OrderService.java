package com.supplychain.order.service;

import java.util.Optional;

import com.supplychain.order.model.OrderModel;

public interface OrderService {

	public OrderModel createOrder(Optional<OrderModel> orderModel);

	public OrderModel findOrderByGuid(String orderGuid);

	public OrderModel updateOrder(Optional<OrderModel> orderModel);

	public void deleteOrder(String orderGuid);

	public OrderModel findOrderByCreatedBy(String createdBy);
}
