package com.jdc.console.app.exceptions;

public class InvalidComponentDataException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private String conponent;
	
	public InvalidComponentDataException(String conponent, String message) {
		super(message);
		this.conponent = conponent;
	}
	
	public String getConponent(){
		return conponent;
		
	}
	
}
