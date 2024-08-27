package com.app.tester;

import java.util.Arrays;
import java.util.List;

public class TestMethodReference {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Displaying list via lambda expression");
		list.forEach(l->System.out.println(l));
		System.out.println("Displaying list via Method reference");
		list.forEach(System.out::println);
		System.out.println("Displaying list via lambda again");
		list.forEach(l->System.out.print(l+" "));
		//above lambda expression cannot be written using method reference.
	}
}
