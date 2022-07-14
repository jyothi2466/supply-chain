package com.supplychain.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplychain.order.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
	
	public Order findByCreatedBy(String createdBy);

}
