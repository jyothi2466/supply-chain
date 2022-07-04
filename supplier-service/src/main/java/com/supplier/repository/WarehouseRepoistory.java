package com.supplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplier.entity.Warehouse;

@Repository
public interface WarehouseRepoistory extends JpaRepository<Warehouse, String> {

}
