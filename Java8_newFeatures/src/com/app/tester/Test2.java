package com.app.tester;

import static com.app.utils.CollectionUtils.populateListfromMap;
import static com.app.utils.CollectionUtils.populateMap;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.books.Book;

public class Test2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		//get PopulatedList
		List<Book> books=populateListfromMap(populateMap());
		System.out.println("original List of Books:");
		books.forEach(b->System.out.println(b));
		//remove all the books from the list published before a specified date
		System.out.println("Enter published Date(yr-mon-day)");
		LocalDate date=LocalDate.parse(sc.next());
		
		//Higher Order Function default boolean removeIf(predicate<? super T> filter)
		//Functional i/f Predicate having SAM boolean test(T t) 
		books.removeIf(b->b.getPublishDate().isBefore(date));
		System.out.println("List after removing books having publishedDate before specified date");
		books.forEach(b->System.out.println(b));
	}
}
}
