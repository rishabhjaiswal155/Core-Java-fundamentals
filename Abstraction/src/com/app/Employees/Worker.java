package com.app.Employees;

public abstract class Worker extends Employee {
	private double sal;

	public Worker(String firstName, String lastName, double sal) {
		super(firstName, lastName);
		this.sal = sal;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Worker [sal=" + sal + "]";
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	@Override
	public abstract void computeSal();

}
