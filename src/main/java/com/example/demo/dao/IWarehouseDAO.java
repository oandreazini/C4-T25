package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Warehouse;

public interface IWarehouseDAO  extends JpaRepository<Warehouse, Long> {

}
