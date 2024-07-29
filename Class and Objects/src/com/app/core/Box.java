package com.app.core;

public class Box {
	private double width,depth,height;
	public Box(double width,double depth,double height) {
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	public Box(double side) {
		//width=depth=height=side; Against DRY
		this(side,side,side);//constructor chaining
	}
	public Box() {
		this(100,100,100);//constructor chaining
	}
	public boolean isEqual(Box another) {
		return this.width==another.width && this.depth==another.depth && this.height==another.height;
	}
	public String getBoxDimensions() {
		return "Box Dimensions:"+width+" "+depth+" "+height;
	}
	
	public double getVolume() {
		return width*depth*height;
	}
}
