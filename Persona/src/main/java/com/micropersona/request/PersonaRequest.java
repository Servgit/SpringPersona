package com.micropersona.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaRequest {
	
	@JsonProperty("nombre")
	private String nombre;

}
