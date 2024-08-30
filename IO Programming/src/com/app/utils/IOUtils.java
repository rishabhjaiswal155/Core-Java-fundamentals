package com.app.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;
import com.app.products.Product;
public interface IOUtils {
	static void storeProductDetailsinFile(Stream<Product> products,String fileName) throws IOException {
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName))) {
			     products
			     .forEach(pw::println);//p->pw.println(p)
				}
	}
}
