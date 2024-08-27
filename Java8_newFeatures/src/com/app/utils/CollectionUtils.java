package com.app.utils;
import static com.app.books.Category.LOVESTORY;
import static com.app.books.Category.RELIGIOUS;
import static com.app.books.Category.SCIFI;
import static com.app.books.Category.TECHNOLOGY;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.books.Book;

public interface CollectionUtils {
	static HashMap<String,Book> populateMap(){
		HashMap<String,Book> books=new HashMap<>();
		books.put("Java",new Book("Java",TECHNOLOGY,450,parse("2018-04-22"),"James Gosling", 10));
		books.put("Ramayana",new Book("Ramayana",RELIGIOUS,850,parse("2003-02-21"),"Tulsidas", 100));
		books.put("Metour",new Book("Metour",SCIFI,1050,parse("2015-09-23"),"Ruhan", 105));
		books.put("Half-GirlFriend",new Book("Half-GirlFriend",LOVESTORY,250,parse("2015-01-02"),"Chetan Bhagat", 1000));
		books.put("C",new Book("C",TECHNOLOGY,150,parse("2003-01-22"),"Dennies Ritchie", 1000));
		return books;
	}
	
	static List<Book> populateListfromMap(Map<String,Book> map){
		return new ArrayList<Book>(map.values());
	}
}
