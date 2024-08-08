package list;
import java.util.ArrayList;
import java.util.Collections;
public class TestArrayList {

	public static void main(String[] args) {
		//List is ordered collection.
		//It perform index based operations
		//List can contain duplicate values
		//List can contain null values
		//Initial capacity of list is 10.
		//Capacity of List can grow and its capacity depends on underlying JVM.
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Size of List:"+list.size());
		int[] data= {10,20,30,40,10,20,40,90,-10,0,45};
		for(int i:data) {
			list.add(i);
		}
		System.out.println(list);
		list.add(0, 99);
		System.out.println("After adding the element at specified index:"+list);
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(list);
		System.out.println("After appending existing list:"+list);
		System.out.println("After appending New List"+list2);
		list2.clear();
		System.out.println("After using clear method"+list2);
		System.out.println("Checking if list conatains specified element:"+list.contains(10));
		list.remove(list.size()-1);
		System.out.println("After removing the specified index element:"+list);
		System.out.println("First occurence of specified element:"+list.indexOf(20)+" "+"last occurence of specified element:"+list.lastIndexOf(20));
		System.out.println("Element at specified index:"+list.get(3));
		System.out.println("replacing the specified element at specified index:"+list.set(0, 1111));
		System.out.println("List after replacing:"+list);
		Collections.sort(list);
		System.out.println("list After sorting in Ascending order:"+list);
	}

}
