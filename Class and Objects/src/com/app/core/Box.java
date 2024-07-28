package com.app.core;

public class Box {
	private double width,depth,height;
	public Box(double width,double depth,double height) {
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	public String getBoxDimensions() {
		return "Box Dimensions:"+width+" "+depth+" "+height;
	}
	
	public double getVolume() {
		return width*depth*height;
	}
}
