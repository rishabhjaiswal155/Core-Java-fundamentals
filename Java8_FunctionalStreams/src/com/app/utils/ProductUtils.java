package com.app.utils;

import static com.app.category.Category.COSMETICS;
import static com.app.category.Category.GRAINS;
import static com.app.category.Category.OIL;
import static com.app.category.Category.STATIONARY;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.products.Product;

public interface ProductUtils {
	static List<Product> populateData() {
		List<Product> products=new ArrayList<>();
		products.add(new Product(100,"GroundNut oil",OIL,parse("2024-02-01"),1100));
		products.add(new Product(110,"Ricebran oil",OIL,parse("2024-05-22"),1500));
		products.add(new Product(150,"Rice",GRAINS,parse("2024-02-25"),900));
		products.add(new Product(114,"Cream",COSMETICS,parse("2023-04-22"),110));
		products.add(new Product(103,"pen",STATIONARY,parse("2024-01-25"),50));
		products.add(new Product(105,"SoyaBean oil",OIL,parse("2024-07-22"),800));
        return products;
	}
	
	static Map<Integer,Product> populateMapfromList(List<Product> list){
        HashMap<Integer,Product> productmap=new HashMap<>();
		for(Product p:list)
			productmap.put(p.getId(),p);
		return productmap;
	}
}
