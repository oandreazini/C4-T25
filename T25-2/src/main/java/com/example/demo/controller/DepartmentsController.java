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

import com.example.demo.dto.Departments;
import com.example.demo.service.DepartamentsServiceImpl;


@RestController
@RequestMapping("/api")
public class DepartmentsController {

	@Autowired
	DepartamentsServiceImpl departementsservideImpl;

	@GetMapping("/departments")
	public List<Departments> listDepartments(){
		return departementsservideImpl.listDepartments();
	}

	@PostMapping("/departments")
	public Departments saveDepartments(@RequestBody Departments departments) {

		return departementsservideImpl.saveDepartments(departments);
	}

	@GetMapping("/departments/{id}")
	public Departments departmentsXID(@PathVariable(name="id") Long id) {
		

		return departementsservideImpl.departmentsXID(id);
	}

	@PutMapping("/departments/{id}")
	public Departments updateDepartments(@PathVariable(name="id")Long id,@RequestBody Departments departments) {

		Departments departments_select;
		Departments departments_update;

		departments_select= departementsservideImpl.departmentsXID(id);

		departments_select.setName(departments.getName());
		departments_select.setBudget(departments.getBudget());
		departments_select.setEmployee(departments.getEmployee());

		departments_update = departementsservideImpl.updateDepartments(departments_select);

		System.out.println("El Departments actualizado es: "+ departments_update);

		return departments_update;
	}

	@DeleteMapping("/departments/{id}")
	public void deleteDepartments(@PathVariable(name="id")Long id) {
		departementsservideImpl.deleteDepartments(id);
	}

}
