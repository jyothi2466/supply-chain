package com.supplychain.order.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.supplychain.order.model.OrderModel;
import com.supplychain.order.serviceimpl.OrderServiceImpl;

@RestController
@RequestMapping(value = "/api/order/v1")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@PostMapping("/create")
	public OrderModel createOrder(@Validated @RequestBody OrderModel orderModel) {
		Optional<OrderModel> optionalOrderModel = Optional.ofNullable(orderModel);
		return orderServiceImpl.createOrder(optionalOrderModel);
	}
	
	@GetMapping("/findByGuid")
	public OrderModel findOrderByGuId(@RequestParam("orderGuid") String orderGuid) {
		return orderServiceImpl.findOrderByGuid(orderGuid);
	}
	
	@PostMapping("/update")
	public OrderModel updateOrder(@Validated @RequestBody Optional<OrderModel> optionalOrderModel) {
		return orderServiceImpl.updateOrder(optionalOrderModel);
	}
	
	@DeleteMapping("/delete")
	public void deleteOrder(@Validated @RequestParam("orderGuid") String orderGuid) {
		orderServiceImpl.deleteOrder(orderGuid);
	}
	
	@GetMapping("/fingByCreatedBy{createdBy}")
	public OrderModel findOrderByCreatedBy(@PathVariable String createdBy) {
		return orderServiceImpl.findOrderByCreatedBy(createdBy);
	}

}
