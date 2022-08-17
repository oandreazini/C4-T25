package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Film;

public interface IFilmService {

	//Metodos del CRUD
	public List<Film> listFilm(); //Listar All 

	public Film saveFilm(Film film);	//Guarda un film CREATE

	public Film filmXID(Long id); //Leer datos de un film READ

	public Film updateFilm(Film film); //Actualiza datos del film UPDATE

	public void deleteFilm(Long id);// Elimina el film DELETE

}
