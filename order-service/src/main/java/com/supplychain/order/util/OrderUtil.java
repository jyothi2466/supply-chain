package com.supplychain.order.util;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.supplychain.order.entities.History;
import com.supplychain.order.entities.LineItem;
import com.supplychain.order.entities.Order;
import com.supplychain.order.entities.OrderStoreSupplier;
import com.supplychain.order.entities.PaymentMethod;
import com.supplychain.order.entities.Status;
import com.supplychain.order.exception.OrderNotFoundException;
import com.supplychain.order.mapper.OrderMapper;
import com.supplychain.order.model.HistoryModel;
import com.supplychain.order.model.LineItemModel;
import com.supplychain.order.model.OrderModel;
import com.supplychain.order.model.OrderStoreSupplierModel;

public class OrderUtil {

	static public Order mapOrderModelToOrder(Optional<OrderModel> optionalOrderModel, OrderMapper orderMapper) {

		OrderModel orderModel = optionalOrderModel
				.orElseThrow(() -> new OrderNotFoundException(OrderConstants.orderErrorMessage));

		orderModel.setOrderGuid(UUID.randomUUID().toString());

		Order order = orderMapper.modelToOrder(orderModel);

		List<LineItem> lineItemsList = optionalOrderModel.map(OrderModel::getLineItemModels)
				.orElseThrow(() -> new OrderNotFoundException(OrderConstants.lineItemErrorMessage)).stream()
				.map(lineItemModel -> mapModelToLineItem(lineItemModel, orderMapper, order))
				.collect(Collectors.toList());

		order.setLineItems(lineItemsList);

		PaymentMethod paymentMethod = new PaymentMethod();
		paymentMethod.setPaymentMethodId(orderModel.getPaymentMethodId());
		order.setPaymentMethod(paymentMethod);

		List<OrderStoreSupplier> orderStoreSupplierList = optionalOrderModel
				.map(OrderModel::getOrderStoreSupplierModels)
				.orElseThrow(() -> new OrderNotFoundException(OrderConstants.orderStoreSupplierMessage)).stream()
				.map(orderStoreModel -> mapModelToOrderStoreSupplier(orderStoreModel, orderMapper, order))
				.collect(Collectors.toList());

		order.setOrderStoreSuppliers(orderStoreSupplierList);

		List<History> historyList = optionalOrderModel.map(OrderModel::getHistoryModels)
				.orElseThrow(() -> new OrderNotFoundException(OrderConstants.historyErrorMessage)).stream()
				.map(historyModel -> mapModelToHistory(historyModel, orderMapper, order)).collect(Collectors.toList());

		order.setHistories(historyList);
		Status status = new Status();
		status.setStatusId(orderModel.getStatusId());
		order.setStatus(status);

		return order;
	}

	static public LineItem mapModelToLineItem(LineItemModel lineItemModel, OrderMapper orderMapper, Order order) {
		lineItemModel.setLineItemGuid(UUID.randomUUID().toString());
		LineItem lineItem = orderMapper.modelToLineItem(lineItemModel);
		lineItem.setOrder(order);
		return lineItem;
	}

	static public OrderStoreSupplier mapModelToOrderStoreSupplier(OrderStoreSupplierModel orderSSModel,
			OrderMapper orderMapper, Order order) {
		orderSSModel.setOssGuid(UUID.randomUUID().toString());
		OrderStoreSupplier orderStoreSupplier = orderMapper.modelToOrderStoreSupplier(orderSSModel);
		orderStoreSupplier.setOrder(order);
		return orderStoreSupplier;
	}

	static public History mapModelToHistory(HistoryModel historyModel, OrderMapper orderMapper, Order order) {
		historyModel.setHistoryGuid(UUID.randomUUID().toString());
		History history = orderMapper.modelToHistory(historyModel);
		history.setOrder(order);
		return history;
	}
}
