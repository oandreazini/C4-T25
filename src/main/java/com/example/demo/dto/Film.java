package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "films") // en caso que la tabla sea diferente
public class Film {
	
	//Atributos de entidad warehouses
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "name")//no hace falta si se llama igual
	private String name;
	@Column(name = "califiedad")//no hace falta si se llama igual
	private int califiedad;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Cinema> cinema;
	
	//Constructores
	
	public Film() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param califiedad
	 * @param cinema
	 */
	public Film(Long id, String name, int califiedad, List<Cinema> cinema) {
	
		this.id = id;
		this.name = name;
		this.califiedad = califiedad;
		this.cinema = cinema;
	}
	
	//Getters y Setters
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

	public int getCalifiedad() {
		return califiedad;
	}

	public void setCalifiedad(int califiedad) {
		this.califiedad = califiedad;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cinema")
	public List<Cinema> getCinema() {
		return cinema;
	}

	public void setCinema(List<Cinema> cinema) {
		this.cinema = cinema;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", name=" + name + ", califiedad=" + califiedad + ", cinema=" + cinema + "]";
	}

}
