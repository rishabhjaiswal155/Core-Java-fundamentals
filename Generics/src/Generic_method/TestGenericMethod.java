package Generic_method;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		//public static <T> List<T> asList(T... args)
		//It returns fixed sized List,thus does not support any structural changes
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		System.out.println(list);
//		list.add(60);
//		list.remove(10);//UnSupportedOperationException
		list.set(0, 999);//It is replace operation doesn't make any structural changes.
		System.out.println(list);
		List<Double> list1=Arrays.asList(10.1,20.2,30.3,40.4,50.5);
		System.out.println(list1);
		//Create Growable size LinkedList
		LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(10,20,30,40,50));
		list2.addFirst(999);
		System.out.println(list2);
		System.out.println(list2.remove());
		System.out.println(list2);
	}
}
