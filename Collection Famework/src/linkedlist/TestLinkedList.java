package linkedlist;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		int[] data= {10,30,65,-65,-65,-90,74,85,26};
		for(int i:data)
			ll.add(i);
		System.out.println("LinkedList:"+ll);
		//The only difference between normal and offer/poll is normal throws exception and poll/offer throws special value
		ll.addFirst(99);
		System.out.println(ll.offerFirst(999));
		System.out.println("LinkedList after addFirst/offerFirst:"+ll);
		ll.addLast(1000);
		System.out.println(ll.offerLast(2000));
		System.out.println("LinkedList after addLast/offerLast:"+ll);
		System.out.println(ll.removeFirst());
		System.out.println(ll.pollFirst());
		System.out.println("LinkedList after removeFirst/pollFirst:"+ll);
		System.out.println(ll.removeLast());
		System.out.println(ll.pollLast());
		System.out.println("LinkedList after removeLast/pollLast:"+ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.peekFirst());
		System.out.println("LinkedList after getFirst/peekFirst:"+ll);
		System.out.println(ll.getLast());
		System.out.println(ll.peekLast());
		System.out.println("LinkedList after getLast/peekLast:"+ll);
}
}