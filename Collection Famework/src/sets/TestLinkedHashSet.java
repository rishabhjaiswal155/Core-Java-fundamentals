package sets;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		int[] data= {10,20,-98,45,98,10,78,-98};
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i:data)
			ll.add(i);
		System.out.println("LinkedList: "+ll);//Ordered,unsorted,allowed dups,null
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(ll);
		System.out.println("LinkedHashSet: "+lhs);//ordered,unsorted,no dups,only one null
	}
}
