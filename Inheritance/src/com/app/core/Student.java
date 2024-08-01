package com.app.core;

public class Student extends Person{
	private int YOP;
	private String course;
	private double fees;
	private double per;
	public Student(String firstName,String lastName,int YOP,String course,double fees,double per) {
		super(firstName,lastName);
		this.YOP=YOP;
		this.course=course;
		this.fees=fees;
		this.per=per;
	}
	@Override
	public String toString() {
		return super.toString()+" "+"graduated in"+" "+YOP+" "+"with course"+" "+course+" "+
	                                      "having fees"+" "+fees+" "+"percentage"+" "+per;
	}
	
	public void study() {
		System.out.println(super.getFirstName()+" "+" of course "+course+" is Studying");
	}

}
