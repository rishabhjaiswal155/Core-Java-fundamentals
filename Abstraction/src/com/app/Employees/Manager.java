package com.app.Employees;

public abstract class Manager extends Employee {
	private double sal;

	public Manager(String firstName, String lastName, double sal) {
		super(firstName, lastName);
		this.sal = sal;
	}
	
	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	

	@Override
	public String toString() {
		return super.toString()+" Manager [sal=" + sal + "]";
	}

	@Override
	public abstract void computeSal();

}
