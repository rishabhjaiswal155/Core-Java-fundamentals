package com.app.tester;
import com.app.core.Point2D;
import java.util.Scanner;
public class Testpoint2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of point to plot");
		Point2D[] points=new Point2D[sc.nextInt()];
		for(int i=0;i<points.length;i++) {
			System.out.println("Enter the X-cordinate and Y-cordinate");
			points[i]=new Point2D(sc.nextInt(),sc.nextInt());
		}
		System.out.println("Points are");
		for(Point2D p:points) {
			System.out.println(p.show());
		}
		System.out.println("Enter two points to check equality in terms of x and y");
		Point2D p1=new Point2D(sc.nextInt(),sc.nextInt());
		Point2D p2=new Point2D(sc.nextInt(),sc.nextInt());
		if(p1.isEqual(p2)) {
			System.out.println("P1 and P2 are equal\n"+p1.show()+"\n "+p2.show());
		}
		else {
			System.out.println("Not equal\n"+p1.show()+"\n "+p2.show());
		}
	}
}
