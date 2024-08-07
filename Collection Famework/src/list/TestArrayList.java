package list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		//List is ordered collection.
		//It perform index based operations
		//List can contain duplicate values
		//List can contain null values
		//Initial capacity of list is 10.
		//Capacity of List can grow and its capacity depends on underlying JVM.
		List<Integer> list=new ArrayList<>();
		System.out.println("Size of List:"+list.size());
		int[] data= {10,20,30,40,10,20,40,90,-10,0,45};
		for(int i:data) {
			list.add(i);
		}
		System.out.println(list);
	}

}
