package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICinemaDAO;
import com.example.demo.dto.Cinema;


@Service
public class CinemaServiceImpl implements ICinemaService {

	// Utilizamos los metodos de la interface IFilmDAO, es como si instaciaramos.
	@Autowired
	ICinemaDAO iCinemaDAO;

	@Override
	public List<Cinema> listCinema() {
		return iCinemaDAO.findAll();
	}

	@Override
	public Cinema saveCinema(Cinema cinema) {
		return iCinemaDAO.save(cinema);
	}

	@Override
	public Cinema cinemaXID(Long id) {
		return iCinemaDAO.findById(id).get();
	}

	@Override
	public Cinema updateCinema(Cinema cinema) {
		return iCinemaDAO.save(cinema);
	}

	@Override
	public void deleteCinema(Long id) {
		iCinemaDAO.deleteById(id);

	}

}
