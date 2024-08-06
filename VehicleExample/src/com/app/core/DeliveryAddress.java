package com.app.core;

public class DeliveryAddress {
private String city;
private String state;
private String country;
private String zipcode;
public DeliveryAddress(String city, String state, String country, String zipcode) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "[city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
}
}
