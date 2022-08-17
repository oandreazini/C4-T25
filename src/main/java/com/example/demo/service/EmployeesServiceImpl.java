package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmployeesDAO;
import com.example.demo.dto.Employees;

@Service
public class EmployeesServiceImpl implements IEmployeesService {

	//Utilizamos los metodos de la interface IEmployeesDAO, es como si instaciaramos.
	@Autowired
	IEmployeesDAO iEmployeesDAO;


	@Override
	public List<Employees> listEmployee() {
		
		return iEmployeesDAO.findAll();
	}

	@Override
	public Employees saveAEmployee(Employees employee) {
		
		return iEmployeesDAO.save(employee);
	}

	@Override
	public Employees employeeXID(Long id) {
		
		return iEmployeesDAO.findById(id).get();
	}

	@Override
	public Employees updateEmployee(Employees employee) {

		return iEmployeesDAO.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {

		iEmployeesDAO.deleteById(id);

	}

}
