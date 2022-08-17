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

import com.example.demo.dto.Manufacturer;
import com.example.demo.service.ManufacturerServiceImpl;

@RestController
@RequestMapping("/api")
public class ManufacturerController {
	
	@Autowired
	ManufacturerServiceImpl manufacturerservideImpl;
	
	@GetMapping("/manufacturer")
	public List<Manufacturer> listManufacturer(){
		return manufacturerservideImpl.listManufacturer();
	}
	
	@PostMapping("/manufacturer")
	public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
		
		return manufacturerservideImpl.saveManufacturer(manufacturer);
	}
	
	@GetMapping("/manufacturer/{id}")
	public Manufacturer manufacturerXID(@PathVariable(name="id") Long id) {
		
		Manufacturer manufacturer_xid= new Manufacturer();
		
		manufacturer_xid=manufacturerservideImpl.manufacturerXID(id);
		
		System.out.println("Manufacturer XID: "+manufacturer_xid);
		
		return manufacturer_xid;
	}
	
	@PutMapping("/manufacturer/{id}")
	public Manufacturer updateManufacturer(@PathVariable(name="id")Long id,@RequestBody Manufacturer manufacturer) {
		
		Manufacturer manufacturer_select;
		Manufacturer manufacturer_update;
		
		manufacturer_select= manufacturerservideImpl.manufacturerXID(id);
		
		manufacturer_select.setName(manufacturer.getName());
	
		manufacturer_update = manufacturerservideImpl.updateManufacturer(manufacturer_select);
		
		System.out.println("El Manufacturer actualizado es: "+ manufacturer_update);
		
		return manufacturer_update;
	}
	
	@DeleteMapping("/manufacturer/{id}")
	public void deleteManufacturer(@PathVariable(name="id")Long id) {
		manufacturerservideImpl.deleteManufacturer(id);
	}

}
