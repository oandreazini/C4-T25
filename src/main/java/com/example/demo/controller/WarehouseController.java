package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Warehouse;
import com.example.demo.service.WarehouseServiceImpl;

@RestController
@RequestMapping("/api")
public class WarehouseController {

	@Autowired
	WarehouseServiceImpl warehouseservideImpl;

	@GetMapping("/warehouse")
	public List<Warehouse> listWarehouse() {
		return warehouseservideImpl.listWarehouse();
	}

	@PostMapping("/warehouse")
	public Warehouse saveWarehouse(@RequestBody Warehouse warehouse) {

		return warehouseservideImpl.saveWarehouse(warehouse);
	}

	@GetMapping("/warehouse/{id}")
	public Warehouse warehouserXID(@PathVariable(name = "id") Long id) {
	
		return warehouseservideImpl.warehouseXID(id);

	}

	@PutMapping("/warehouse/{id}")
	public Warehouse updateWarehouse(@PathVariable(name = "id") Long id, @RequestBody Warehouse warehouse) {

		Warehouse warehouse_select;
		Warehouse warehouse_update;

		warehouse_select = warehouseservideImpl.warehouseXID(id);

		warehouse_select.setPlace(warehouse.getPlace());
		warehouse_select.setCapacity(warehouse.getCapacity());
		warehouse_select.setBox(warehouse.getBox());

		warehouse_update = warehouseservideImpl.updateWarehouse(warehouse_select);

		System.out.println("El Warehouse actualizado es: " + warehouse_update);

		return warehouse_update;
	}

	@DeleteMapping("/warehouse/{id}")
	public void deleteWarehouse(@PathVariable(name = "id") Long id) {
		warehouseservideImpl.deleteWarehouse(id);
	}

}
