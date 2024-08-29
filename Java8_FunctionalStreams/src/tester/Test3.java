package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test3 {

	public static void main(String[] args) {
		// Create stream of ints between 1-100 and display all even elements.
System.out.println("Even Elements between 1-100");
		IntStream
		.range(1, 101)
		.filter(i->i%2==0)
		.forEach(System.out::println);
		
		//create Stream<Integer> from a fixed size list(unsorted) of integers,sort and display it.
    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20,-10,9,7,45,356,458,74,23));
    System.out.println("Original list");
    list.forEach(l->System.out.print(l+" "));
    System.out.println("\nSorted List");
    list
    .stream()
    .sorted()
    .forEach(l->System.out.print(l+" "));
	}
}
