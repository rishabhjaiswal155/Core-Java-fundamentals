package com.app.core;

public class Person {
private String firstName,lastName;
public Person(String firstName,String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
}
@Override
public String toString() {
	return firstName+" "+lastName;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

}
