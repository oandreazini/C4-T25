package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Manufacturer;

public interface IManufacturerService {
	
	//Metodos del CRUD
		public List<Manufacturer> listManufacturer(); //Listar All 
		
		public Manufacturer saveManufacturer(Manufacturer manufacturer);	//Guarda un manufacturer CREATE
		
		public Manufacturer manufacturerXID(Long id); //Leer datos de un manufacturer READ
		
		public Manufacturer updateManufacturer(Manufacturer manufacturer); //Actualiza datos del manufacturer UPDATE
		
		public void deleteManufacturer(Long id);// Elimina el manufacturer DELETE

}
