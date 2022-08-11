package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cinema;

public interface ICinemaService {
	
	//Metodos del CRUD
	public List<Cinema> listCinema(); //Listar All 

	public Cinema saveCinema(Cinema cinema);	//Guarda un cinema CREATE

	public Cinema cinemaXID(Long id); //Leer datos de un cinema READ

	public Cinema updateCinema(Cinema cinema); //Actualiza datos del cinema UPDATE

	public void deleteCinema(Long id);// Elimina el cinema DELETE

}
