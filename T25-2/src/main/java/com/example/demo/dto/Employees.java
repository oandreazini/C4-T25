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
@Table(name = "employees") // en caso que la tabla sea diferente
public class Employees {

	// Atributos de entidad article
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "DNI") // no hace falta si se llama igual
	private String DNI;
	@Column(name = "name") // no hace falta si se llama igual
	private String name;
	@Column(name = "surname") // no hace falta si se llama igual
	private String surname;

	@ManyToOne
	@JoinColumn(name = "departments_id")
	private Departments departments;

	// Constructores

	public Employees() {

	}

	/**
	 * 
	 * @param id
	 * @param dNI
	 * @param name
	 * @param surname
	 * @param departments
	 */
	public Employees(Long id, String dNI, String name, String surname, Departments departments) {
		super();
		this.id = id;
		DNI = dNI;
		this.name = name;
		this.surname = surname;
		this.departments = departments;
	}

	// getter y setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", DNI=" + DNI + ", name=" + name + ", surname=" + surname + ", departments="
				+ departments + "]";
	}

}
