package com.micropersona.response;

import java.util.Date;

public class PersonaResponse{
	
	private Date timestamp;
	private String message;
	private String details;
	
	
	public PersonaResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public String getMessage() {
		return message;
	}


	public String getDetails() {
		return details;
	}

	

}
