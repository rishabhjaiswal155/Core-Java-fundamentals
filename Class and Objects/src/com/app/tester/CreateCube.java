package com.app.tester;
import java.util.Scanner;
import com.app.core.Box;
public class CreateCube {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of Cube: side");
		Box cube=new Box(sc.nextDouble());
		System.out.println(cube.getBoxDimensions());
		System.out.println(cube.getVolume());
		Box def=new Box();
		System.out.println(def.getBoxDimensions());//100 100 100
	}

}
