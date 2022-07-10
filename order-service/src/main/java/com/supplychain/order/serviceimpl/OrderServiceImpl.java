package com.supplychain.order.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplychain.order.entities.Order;
import com.supplychain.order.exception.OrderNotFoundException;
import com.supplychain.order.mapper.OrderMapper;
import com.supplychain.order.model.OrderModel;
import com.supplychain.order.repository.OrderRepository;
import com.supplychain.order.service.OrderService;
import com.supplychain.order.util.OrderUtil;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private OrderRepository orderRepository;

	public OrderModel createOrder(Optional<OrderModel> optionalOrderModel) {
		Order order = orderRepository.save(OrderUtil.mapOrderModelToOrder(optionalOrderModel, orderMapper));
		return orderMapper.orderToModel(order);
	}

	@Override
	public OrderModel findOrderByGuid(String orderGuid) {
		Optional<Order> optionalOrder = orderRepository.findById(orderGuid);
		Order order = optionalOrder.orElseThrow(()-> new OrderNotFoundException("Order Not Found"));
		return orderMapper.orderToModel(order);
	}

}
