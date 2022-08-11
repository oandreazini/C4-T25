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

import com.example.demo.dto.Employees;
import com.example.demo.service.EmployeesServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeesController {
	
	@Autowired
	EmployeesServiceImpl employeesservideImpl;

	@GetMapping("/employees")
	public List<Employees> listEmployee(){
		return employeesservideImpl.listEmployee();
	}

	@PostMapping("/employees")
	public Employees saveAEmployee(@RequestBody Employees employee) {

		return employeesservideImpl.saveAEmployee(employee);
	}

	@GetMapping("/employees/{id}")
	public Employees employeeXID(@PathVariable(name="id") Long id) {

		
		return employeesservideImpl.employeeXID(id);
	}

	@PutMapping("/employees/{id}")
	public Employees updateEmployee(@PathVariable(name="id")Long id,@RequestBody Employees employee) {

		Employees employee_select;
		Employees employee_update;

		employee_select= employeesservideImpl.employeeXID(id);
		
		employee_select.setDNI(employee.getDNI());
		employee_select.setName(employee.getName());
		employee_select.setSurname(employee.getSurname());
		employee_select.setDepartments(employee.getDepartments());
		
		employee_update = employeesservideImpl.updateEmployee(employee_select);

		System.out.println("El Employees actualizado es: "+ employee_update);

		return employee_update;
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name="id")Long id) {
		employeesservideImpl.deleteEmployee(id);
	}

}
