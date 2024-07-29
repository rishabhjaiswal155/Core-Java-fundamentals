package com.app.core;
import java.lang.Math;
public class Point2D {
	private int x,y;
	public Point2D(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String show() {
		return "point's X-cordinate:"+x+" "+"Point's Y-cordinate:"+y;
	}
	public boolean isEqual(Point2D another) {
		return this.x==another.x && this.y==another.y;
	}
	

}
