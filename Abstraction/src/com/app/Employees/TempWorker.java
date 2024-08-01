package com.app.Employees;

public class TempWorker extends Worker {
	private double overtime;
	public TempWorker(String firstName, String lastName, double sal, double overtime) {
		super(firstName, lastName, sal);
		this.overtime = overtime;
	}
	
	@Override
	public void computeSal() {
	System.out.println(super.getSal()+overtime);
	}

	@Override
	public String toString() {
		return super.toString()+" TempWorker [overtime=" + overtime + "]";
	}
	
	

}
