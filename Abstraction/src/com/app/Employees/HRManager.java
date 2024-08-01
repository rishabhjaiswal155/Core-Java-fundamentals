package com.app.Employees;

public class HRManager extends Manager {
	private double incenetives;
     
	public HRManager(String firstName, String lastName, double sal, double incenetives) {
		super(firstName, lastName, sal);
		this.incenetives = incenetives;
	}

	@Override
	public void computeSal() {
            System.out.println(super.getSal()+incenetives);	
	}

	@Override
	public String toString() {
		return super.toString()+" HRManager [incenetives=" + incenetives + "]";
	}
	
	

}
