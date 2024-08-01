package com.app.shape;
import static java.lang.Math.PI;
public class Circle extends BoundedShape{
	private double radius;

	public Circle(double x, double y,double radius) {
		super(x,y);
		this.radius=radius;
	}

	@Override
	public String toString() {
		return  super.toString()+"Circle radius=" + radius ;
	}
	@Override
	public double area() {
		return  PI*radius*radius;
	}


}
