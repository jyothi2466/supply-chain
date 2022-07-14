package com.supplychain.order.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.supplychain.order.entities.Order;
import com.supplychain.order.entities.PaymentMethod;
import com.supplychain.order.entities.Status;
import com.supplychain.order.exception.OrderNotFoundException;
import com.supplychain.order.mapper.OrderMapper;
import com.supplychain.order.model.OrderModel;
import com.supplychain.order.repository.OrderRepository;
import com.supplychain.order.service.OrderService;
import com.supplychain.order.util.OrderUtil;

@Service
public class OrderServiceImpl implements OrderService {
	
	private final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private OrderRepository orderRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public OrderModel createOrder(Optional<OrderModel> optionalOrderModel) {
		Order order = orderRepository.save(OrderUtil.mapOrderModelToOrder(optionalOrderModel, orderMapper));
		logger.info("Order Details--->"+order);
		return orderMapper.orderToModel(order);
	}

	@Override
	public OrderModel findOrderByGuid(String orderGuid) {
		Optional<Order> optionalOrder = orderRepository.findById(orderGuid);
		Order order = optionalOrder.orElseThrow(() -> new OrderNotFoundException("Order Not Found"));
		return orderMapper.orderToModel(order);
	}

	@Override
	public OrderModel updateOrder(Optional<OrderModel> optionalOrderModel) {
		OrderModel orderModel = optionalOrderModel.orElseThrow(() -> new OrderNotFoundException("Order Not Found"));
		Order order = orderMapper.modelToOrder(orderModel);
		PaymentMethod paymentMethod = new PaymentMethod();
		paymentMethod.setPaymentMethodId(orderModel.getPaymentMethodId());
		order.setPaymentMethod(paymentMethod);

		Status status = new Status();
		status.setStatusId(orderModel.getStatusId());
		order.setStatus(status);
		return orderMapper.orderToModel(orderRepository.save(order));
	}

	public void deleteOrder(String orderGuid) {
		orderRepository.deleteById(orderGuid);
	}

	@Override
	public OrderModel findOrderByCreatedBy(String createdBy) {
		Order order = orderRepository.findByCreatedBy(createdBy);
		return orderMapper.orderToModel(order);
	}

}
