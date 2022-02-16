package com.micropersona.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nombre", length=20, unique=true)
	private String nombre;
	
	@Column(name="edad")
	private String edad;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="id_empresa")
	private long id_empresa;
	
	
	
	public Persona() {
		super();
	}
	

	public Persona(long id, String nombre, String edad, String direccion, long id_empresa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.id_empresa = id_empresa;
	}



	
	

}
