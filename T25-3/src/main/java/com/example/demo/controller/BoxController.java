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

import com.example.demo.dto.Box;
import com.example.demo.service.BoxServiceImpl;

@RestController
@RequestMapping("/api")
public class BoxController {
	
	@Autowired
	BoxServiceImpl boxservideImpl;

	@GetMapping("/box")
	public List<Box> listBox() {
		return boxservideImpl.listBox();
	}

	@PostMapping("/box")
	public Box savBox(@RequestBody Box box) {

		return boxservideImpl.saveBox(box);
	}

	@GetMapping("/box/{id}")
	public Box boxXID(@PathVariable(name = "id") Long id) {

	return boxservideImpl.boxXID(id);

				 
	}

	@PutMapping("/box/{id}")
	public Box updateBox(@PathVariable(name = "id") Long id, @RequestBody Box box) {

		Box box_select;
		Box box_update;

		box_select = boxservideImpl.boxXID(id);

		box_select.setNumReference(box.getNumReference());
		box_select.setContents(box.getContents());
		box_select.setValue(box.getValue());
		box_select.setWarehouse(box.getWarehouse());

		box_update = boxservideImpl.updateBox(box_select);

		System.out.println("El box actualizado es: " + box_update);

		return box_update;
	}

	@DeleteMapping("/box/{id}")
	public void deleteBox(@PathVariable(name = "id") Long id) {
		boxservideImpl.deleteBox(id);
	}

}
