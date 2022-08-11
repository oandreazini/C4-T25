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

import com.example.demo.dto.Film;
import com.example.demo.service.FilmServiceImpl;

@RestController
@RequestMapping("/api")
public class FilmController {
	
	@Autowired
	FilmServiceImpl filmservideImpl;

	@GetMapping("/film")
	public List<Film> listFilm() {
		return filmservideImpl.listFilm();
	}

	@PostMapping("/film")
	public Film saveFilm(@RequestBody Film film) {

		return filmservideImpl.saveFilm(film);
	}

	@GetMapping("/film/{id}")
	public Film filmrXID(@PathVariable(name = "id") Long id) {
	
		return filmservideImpl.filmXID(id);

	}

	@PutMapping("/film/{id}")
	public Film updateFilm(@PathVariable(name = "id") Long id, @RequestBody Film film) {

		Film film_select;
		Film film_update;

		film_select = filmservideImpl.filmXID(id);

		film_select.setName(film.getName());
		film_select.setCalifiedad(film.getCalifiedad());
		film_select.setCinema(film.getCinema());

		film_update = filmservideImpl.updateFilm(film_select);

		System.out.println("El Film actualizado es: " + film_update);

		return film_update;
	}

	@DeleteMapping("/film/{id}")
	public void deleteFilm(@PathVariable(name = "id") Long id) {
		filmservideImpl.deleteFilm(id);
	}

}
