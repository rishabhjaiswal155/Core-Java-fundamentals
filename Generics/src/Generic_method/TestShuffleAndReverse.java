package Generic_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TestShuffleAndReverse {

	public static void main(String[] args) {
		List<?> l1=new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
		System.out.println(l1);
		//public static void shuffle(List<?> list)
		//public static <T> void shuffle(List<T> list)
		Collections.shuffle(l1);
		System.out.println("Shuffled list: "+l1);
		
		//public static void reverse(List<?> list)
		//public static <T> void reverse(List<T> list)
		Collections.reverse(l1);
		System.out.println("Reversed: "+l1);
		
		l1=new Vector<String>(Arrays.asList("one","two","three","four"));
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println("Shuffled list: "+l1);
		Collections.reverse(l1);
		System.out.println("Reversed: "+l1);
	}
}
