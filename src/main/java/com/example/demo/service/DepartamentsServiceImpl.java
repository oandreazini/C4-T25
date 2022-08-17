package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartmentsDAO;
import com.example.demo.dto.Departments;

@Service
public class DepartamentsServiceImpl  implements IDepartmentsService{
	
	//Utilizamos los metodos de la interface IDepartmentsDAO, es como si instaciaramos.
	@Autowired
	IDepartmentsDAO iDepartmentsDAO;

	@Override
	public List<Departments> listDepartments() {
		
		return iDepartmentsDAO.findAll();
	}

	@Override
	public Departments saveDepartments(Departments departments) {
		
		return iDepartmentsDAO.save(departments);
	}

	@Override
	public Departments departmentsXID(Long id) {

		return  iDepartmentsDAO.findById(id).get();
	}

	@Override
	public Departments updateDepartments(Departments departments) {
		
		return iDepartmentsDAO.save(departments);
	}

	@Override
	public void deleteDepartments(Long id) {
		
		iDepartmentsDAO.deleteById(id);
	}
	
	
}
