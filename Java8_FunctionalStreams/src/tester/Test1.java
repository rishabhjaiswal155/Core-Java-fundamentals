package tester;

import java.util.Arrays;
public class Test1 {

	public static void main(String[] args) {
		//Create int[],convert it into IntStream and display its contents.
		
		int[] data= {10,20,64,78,65,-10,45,-100,45};
        Arrays
        .stream(data)
        .forEach(System.out::println);
	}
}
