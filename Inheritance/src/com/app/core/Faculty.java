package com.app.core;
public class Faculty extends Person {
private int experience;
private String expertise;
public Faculty(String firstName,String lastName,int experience,String expertise) {
	super(firstName,lastName);
	this.experience=experience;
	this.expertise=expertise;
}
@Override
public String toString() {
	return super.toString()+" "+" having experience of"+" "+experience+
			    " "+"yrs"+" expert in"+" "+expertise;
}
	
public void teach() {
	System.out.println(super.getLastName()+" "+"having expertise in"+" "+expertise+" "+" is teaching");
}


}
