package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departments;


public interface IDepartmentsService {
	
	//Metodos del CRUD
	public List<Departments> listDepartments(); //Listar All 
	
	public Departments saveDepartments(Departments departments);//Guarda un departments CREATE
	
	public Departments departmentsXID(Long id); //Leer datos de un departments READ
	
	public Departments updateDepartments(Departments departments); //Actualiza datos del departments UPDATE
	
	public void deleteDepartments(Long id);// Elimina el departments DELETE

}

