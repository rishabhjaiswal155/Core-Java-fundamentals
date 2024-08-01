package com.app.shape;

public class Rectangle extends BoundedShape {
	private double width,height;

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString()+"Rectangle [width=" + width + ", height=" + height + "]";
	}
	@Override
	public double area() {
		return width*height;
	}

}
