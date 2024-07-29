package com.app.tester;
import java.util.Scanner;
import com.app.core.Box;
public class CreateBox {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Box 1 Dimensions: width,depth,height");
		Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1);
		System.out.println( b1.getBoxDimensions());
		System.out.println(b1.getVolume());
		System.out.println("Enter Box 2 Dimensions: width,depth,height");
		Box b2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b2);
		System.out.println( b2.getBoxDimensions());
		System.out.println(b2.getVolume());
		System.out.println(b1.isEqual(b2));
		sc.close();
	}

}
