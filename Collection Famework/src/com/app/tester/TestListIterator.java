package com.app.tester;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		int[] data= {10,6,30,45,85,95,-10,-65,89,10,6,30};
		ArrayList<Integer> list=new ArrayList<>();
		for(int i:data)
			list.add(i);
		System.out.println("ArrayList:"+list);
		ListIterator<Integer> intItr=list.listIterator(list.size());
		//list.add(35);//if we made any structural modification after creating itreator then it will not allow as it will give non-deterministic behavior.
		//Thus throw exception concurrentModificationException
		System.out.print("ArrayList in reverse order is:");
		while(intItr.hasPrevious()) {
			System.out.print(intItr.previous()+" ");
		}
	}
}
