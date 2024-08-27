package com.app.tester;
import static com.app.utils.CollectionUtils.populateMap;

import java.util.HashMap;

import com.app.books.Book;
public class Test3 {

	public static void main(String[] args) {
		//get populatedMap
		HashMap<String,Book>books=populateMap();
		
		//display all the books title with complete book details from the map without converting it into collection views(.values())
		
		//Map i/f Higher order Function default void forEach(BiConsumer<? super k,? super v> action)
		//Functional Interface BiConsumer having SAM void accept(T t,U u)
		books.forEach((k,v)->System.out.println(k+":"+v));
	}
}
