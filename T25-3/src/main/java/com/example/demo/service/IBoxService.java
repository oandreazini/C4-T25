package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Box;

public interface IBoxService {
	
	//Metodos del CRUD
		public List<Box> listBox(); //Listar All 

		public Box saveBox(Box box);	//Guarda un Box CREATE

		public Box boxXID(Long id); //Leer datos de un Box READ

		public Box updateBox(Box box); //Actualiza datos del Box UPDATE

		public void deleteBox(Long id);// Elimina el Box DELETE
		
}
