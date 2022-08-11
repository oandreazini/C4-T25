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
@Table(name = "departments") // en caso que la tabla sea diferente
public class Departments {

	// Atributos de entidad Departments
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "name") // no hace falta si se llama igual
	private String name;
	@Column(name = "budget") // no hace falta si se llama igual
	private int budget;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Employees> employee;

	// Constructores

	public Departments() {

	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param budget
	 * @param employee
	 */
	public Departments(Long id, String name, int budget, List<Employees> employee) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
		this.employee = employee;
	}

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

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Employees")
	public List<Employees> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employees> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Departments [id=" + id + ", name=" + name + ", budget=" + budget + ", employee=" + employee + "]";
	}

}
