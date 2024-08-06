package com.app.custom_exception;

@SuppressWarnings("serial")
public class VehicleValidationException extends Exception {
	public VehicleValidationException(String msg) {
		super(msg);
	}
	

}
