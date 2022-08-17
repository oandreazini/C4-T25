package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.Employees;

public interface IEmployeesService {

	//Metodos del CRUD
	public List<Employees> listEmployee(); //Listar All 
	
	public Employees saveAEmployee(Employees employee);	//Guarda un employee CREATE
	
	public Employees employeeXID(Long id); //Leer datos de un employee READ
	
	public Employees updateEmployee(Employees employee); //Actualiza datos del employee UPDATE
	
	public void deleteEmployee(Long id);// Elimina el employee DELETE

}
