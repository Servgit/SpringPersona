package com.micropersona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micropersona.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
	public Persona findByNombre(String nombre);

}
