package com.app.customexception;

@SuppressWarnings("serial")
public class VehicleValidationException extends Exception {
	public VehicleValidationException(String msg) {
		super(msg);
	}

}
