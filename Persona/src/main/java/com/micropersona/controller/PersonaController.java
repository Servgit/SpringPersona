package com.micropersona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micropersona.entity.Persona;
import com.micropersona.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService miPersonService;
	
	@GetMapping("/todos")
	public List<Persona> getAll(){
		return miPersonService.getAllPersonas();
	}
	
	@GetMapping("/obtenerpornombre/{nombre}")
	public Persona traer(@PathVariable String nombre) {
		return miPersonService.getpersona(nombre);
	}
	
	@PostMapping("/agregar")
	public Persona agregar(@RequestBody Persona persona) {
		return miPersonService.agregar(persona);
	}
	
}

