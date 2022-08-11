package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.Warehouse;

public interface IWarehouseService {

	//Metodos del CRUD
	public List<Warehouse> listWarehouse(); //Listar All 

	public Warehouse saveWarehouse(Warehouse warehouse);	//Guarda un warehouse CREATE

	public Warehouse warehouseXID(Long id); //Leer datos de un warehouse READ

	public Warehouse updateWarehouse(Warehouse warehouse); //Actualiza datos del warehouse UPDATE

	public void deleteWarehouse(Long id);// Elimina el warehouse DELETE

}
