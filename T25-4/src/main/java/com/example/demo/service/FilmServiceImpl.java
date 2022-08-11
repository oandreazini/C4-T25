package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFilmDAO;
import com.example.demo.dto.Film;

@Service
public class FilmServiceImpl implements IFilmService {

	// Utilizamos los metodos de la interface IFilmDAO, es como si instaciaramos.
	@Autowired
	IFilmDAO iFilmDAO;
	
	@Override
	public List<Film> listFilm() {
		return iFilmDAO.findAll();
	}

	@Override
	public Film saveFilm(Film film) {
		return iFilmDAO.save(film);
	}

	@Override
	public Film filmXID(Long id) {
		return iFilmDAO.findById(id).get();
	}

	@Override
	public Film updateFilm(Film film) {
		return iFilmDAO.save(film);
	}

	@Override
	public void deleteFilm(Long id) {
		iFilmDAO.deleteById(id);

	}

}
