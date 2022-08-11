package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IBoxDAO;
import com.example.demo.dto.Box;

@Service
public class BoxServiceImpl implements IBoxService {

	// Utilizamos los metodos de la interface IBoxDAO, es como si instaciaramos.
	@Autowired
	IBoxDAO iBoxDAO;

	@Override
	public List<Box> listBox() {
		return iBoxDAO.findAll();
	}

	@Override
	public Box saveBox(Box box) {
		return iBoxDAO.save(box);
	}

	@Override
	public Box boxXID(Long id) {
		return iBoxDAO.findById(id).get();
	}

	@Override
	public Box updateBox(Box box) {
		return iBoxDAO.save(box);
	}

	@Override
	public void deleteBox(Long id) {
		iBoxDAO.deleteById(id);

	}

}
