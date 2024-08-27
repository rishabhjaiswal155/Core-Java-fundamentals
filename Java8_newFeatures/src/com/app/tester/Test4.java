package com.app.tester;
import static com.app.utils.CollectionUtils.populateListfromMap;
import static com.app.utils.CollectionUtils.populateMap;

import java.util.Collections;
import java.util.List;

import com.app.books.Book;
public class Test4 {

	public static void main(String[] args) {
		//use populated list of Books and sort them as per books price using custom ordering and lambda
		
		//get populatedList
		
		List<Book> books=populateListfromMap(populateMap());
		System.out.println("Original list before sorting");
		books.forEach(b->System.out.println(b));
		
		//sort as per price using custom ordering
		//Higher order Function Collections.sort(List<T>,new Comparator<T>())
		//Functional i/f Comparator having SAM public int compare(Object o1,Object o2)
	
		Collections.sort(books,(b1,b2)->((Double)b1.getPrice()).compareTo(b2.getPrice()));
		System.out.println("Sorted List as per price in ascending order");
		books.forEach(b->System.out.println(b));
	}
}
