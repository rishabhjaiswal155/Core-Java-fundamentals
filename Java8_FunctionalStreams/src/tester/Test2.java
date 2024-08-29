package tester;

import java.util.ArrayList;
import java.util.Arrays;
public class Test2 {

	public static void main(String[] args) {
		//Create ArrayList<Integer>,populate it and convert it into sequentialStream and display its contents.
				ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,-40,-100,45,8,2,56,42));
				list
				.stream()
				.forEach(System.out::println);
	}
}
