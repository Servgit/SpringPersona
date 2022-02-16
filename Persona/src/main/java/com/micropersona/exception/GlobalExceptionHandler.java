package com.micropersona.exception;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.micropersona.response.ErrorDetails;
import com.micropersona.response.PersonaResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorDetails> HandlesqlException(SQLException exception, WebRequest webRequest){
		
		ErrorDetails errorDetails = new ErrorDetails(new Date(),"800","Nombre existe, guardar otro nombre");
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(VaciaException.class)
	public ResponseEntity<PersonaResponse> handlenopersonaException(VaciaException exception){
		
		PersonaResponse personaResponse = new PersonaResponse(new Date(),"1500", exception.getMessage());
		return new ResponseEntity<>(personaResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorDetails> NohayException(NullPointerException exception, WebRequest webRequest){
		
		ErrorDetails errorDetails = new ErrorDetails(new Date(),"1000","Persona desconocida");
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
