package com.micropersona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micropersona.entity.Persona;
import com.micropersona.exception.VaciaException;
import com.micropersona.repository.PersonaRepository;


@Service
public class PersonaService {
	@Autowired
	private PersonaRepository repo;
	
	public List<Persona> getAllPersonas(){
		List<Persona> personas =  repo.findAll();
		if(personas.isEmpty()) {
			throw new VaciaException("no hay personas");
		}
		return personas;
	}
	
	public Persona agregar(Persona persona) {
		return repo.save(persona);
	}
	
	public Persona getpersona(String nombre) {
		return repo.findByNombre(nombre);
	}

}
