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

import com.example.demo.dto.Cinema;
import com.example.demo.service.CinemaServiceImpl;

@RestController
@RequestMapping("/api")
public class CinemaController {
	
	@Autowired
	CinemaServiceImpl cinemaservideImpl;

	@GetMapping("/cinema")
	public List<Cinema> listCinema() {
		return cinemaservideImpl.listCinema();
	}

	@PostMapping("/cinema")
	public Cinema saveCinema(@RequestBody Cinema cinema) {

		return cinemaservideImpl.saveCinema(cinema);
	}

	@GetMapping("/cinema/{id}")
	public Cinema cinemaXID(@PathVariable(name = "id") Long id) {
	
		return cinemaservideImpl.cinemaXID(id);

	}

	@PutMapping("/cinema/{id}")
	public Cinema updateCinema(@PathVariable(name = "id") Long id, @RequestBody Cinema cinema) {

		Cinema cinema_select;
		Cinema cinema_update;

		cinema_select = cinemaservideImpl.cinemaXID(id);

		cinema_select.setName(cinema.getName());
		cinema_select.setFilm(cinema.getFilm());

		cinema_update = cinemaservideImpl.updateCinema(cinema_select);

		System.out.println("El Cinema actualizado es: " + cinema_update);

		return cinema_update;
	}

	@DeleteMapping("/cinema/{id}")
	public void deleteCinema(@PathVariable(name = "id") Long id) {
		cinemaservideImpl.deleteCinema(id);
	}

}
