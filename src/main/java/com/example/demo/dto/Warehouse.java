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
@Table(name="warehouses")//en caso que la tabla sea diferente
public class Warehouse {
	
	//Atributos de entidad warehouses
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "place")//no hace falta si se llama igual
	private String place;
	@Column(name = "capacity")//no hace falta si se llama igual
	private int capacity;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Box> box;
	
	//Constructores
	
	public Warehouse() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param place
	 * @param capacity
	 * @param box
	 */
	public Warehouse(Long id, String place, int capacity, List<Box> box) {
		
		this.id = id;
		this.place = place;
		this.capacity = capacity;
		this.box = box;
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Box")
	public List<Box> getBox() {
		return box;
	}

	public void setBox(List<Box> box) {
		this.box = box;
	}

	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", place=" + place + ", capacity=" + capacity + ", box=" + box + "]";
	}

}
