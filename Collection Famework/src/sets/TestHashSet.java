package sets;

import java.util.HashSet;
import java.util.LinkedList;

public class TestHashSet {
	public static void main(String[] args) {
		int[] data= {10,20,-98,45,98,10,78,-98};
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i:data)
			ll.add(i);
		System.out.println("LinkedList: "+ll);//Ordered,unsorted,allowed dups,null
		HashSet<Integer> hs=new HashSet<>(ll);
		System.out.println("HashSet: "+hs);//unordered,unsorted,no dups,only one null
	}

}
