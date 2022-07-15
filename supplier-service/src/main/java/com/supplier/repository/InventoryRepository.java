package com.supplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplier.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {

}
