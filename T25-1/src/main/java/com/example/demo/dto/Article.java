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
@Table(name = "articles") // en caso que la tabla sea diferente

public class Article {

	// Atributos de entidad article
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "name") // no hace falta si se llama igual
	private String name;
	@Column(name = "price") // no hace falta si se llama igual
	private int price;

	@ManyToOne
	@JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturer;

	// Constructores

	public Article() {

	}

	/**
	 * 
	 * @param id
	 * @param title
	 * @param price
	 * @param manufacturer
	 */
	public Article(Long id, String name, int price, Manufacturer manufacturer) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
	}

	// getter y setter

	/**
	 * 
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return title
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 */

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 
	 * @return manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	/**
	 * 
	 * @param manufacturer
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", price=" + price + ", manufacturer=" + manufacturer + "]";
	}

}
