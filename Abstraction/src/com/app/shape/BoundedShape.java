package com.app.shape;

public abstract class BoundedShape {
	private double x,y;

	public BoundedShape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "BoundedShape [x=" + x + ", y=" + y + "]";
	}
	
	public abstract double area();
}
