package tester;

import java.util.ArrayList;
import java.util.Arrays;
public class Test2 {

	public static void main(String[] args) {
		//Create ArrayList<Integer>,populate it and convert it into sequentialStream and display its contents.
				ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,-40,-100,45,8,2,56,42));
				System.out.println("Sequential stream");
				list
				.stream()
				.forEach(System.out::println);
				
				//convert it into parallelStream and display its contents.
				System.out.println("parallel stream");
				list
				.parallelStream()
				.forEach(System.out::println);
	}
}
