package com.app.tester;
import static com.app.utils.CollectionUtils.populateListfromMap;
import static com.app.utils.CollectionUtils.populateMap;

import java.util.List;

import com.app.books.Book;
public class Test1 {

	public static void main(String[] args) {
		//get PopulatedList
		List<Book> books=populateListfromMap(populateMap());
		System.out.println("Using Imperative way");
		//display all the books from the list
		//Imperative way
		for(Book b:books)
			System.out.println(b);
		
		//Declarative way
		//Higher order function default void forEach(new Consumer<? super T> action)
		//Functional Interface Consumer having SAM void accept(T t)
		System.out.println("Using Declarative way");
		books.forEach(b->System.out.println(b));
	}
}
