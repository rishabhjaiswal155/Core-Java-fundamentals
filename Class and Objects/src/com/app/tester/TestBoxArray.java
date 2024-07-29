package com.app.tester;
import java.util.Scanner;
import com.app.core.Box;
public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of boxes");	
		Box[] boxes=new Box[sc.nextInt()];
		for(int i=0;i<boxes.length;i++) {
			System.out.println("Enter dimensions for boxes");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		System.out.println("Dimension and volumes of all boxes are");
		for(Box b:boxes) {
			System.out.println("Dimensions are:"+b.getBoxDimensions());
			System.out.println("Volume is:"+b.getVolume());
		}

	}

}
