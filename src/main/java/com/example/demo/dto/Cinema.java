package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cinemas") // en caso que la tabla sea diferente
public class Cinema {

	// Atributos de entidad boxes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "name") // no hace falta si se llama igual
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "films_id")
	private Film film;
	
	//Constructores
	
	public Cinema() {
		super();
	}
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param film
	 */
	public Cinema(Long id, String name, Film film) {
		super();
		this.id = id;
		this.name = name;
		this.film = film;
	}
	
	// getter y setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "Cinema [id=" + id + ", name=" + name + ", film=" + film + "]";
	}

}
