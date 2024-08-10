package sets;

import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		int[] data= {10,20,-98,45,98,10,78,-98};
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i:data)
			ll.add(i);
		System.out.println("LinkedList: "+ll);//Ordered,unsorted,allowed dups,null
		TreeSet<Integer> ts=new TreeSet<>(ll);
		System.out.println("TreeSet: "+ts);//sorted,no dups,only one null
	}
}
