package com.app.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.app.category.Category;
import com.app.products.Product;

public interface IOUtils {
	static void storeproductDetails(Product product,String fileName) throws IOException {
		try(DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
			out.writeInt(product.getId());
			out.writeUTF(product.getName());
			out.writeUTF(product.getCategory().toString());
			out.writeUTF(product.getManufactureDate().toString());
			out.writeDouble(product.getPrice());
			System.out.println("product details stored!!!");
		}
	}
	
	static Product restoreProductDetails(String fileName) throws IOException {
		File file=new File(fileName);
		if(file.exists() && file.isFile() && file.canRead()) {
		try(DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))){
		return new Product(in.readInt(),in.readUTF(), Category.valueOf(in.readUTF()),LocalDate.parse(in.readUTF()),in.readDouble());	
		}
	}else {
		System.out.println("Invalid fileName!!!");
		return null;
	}
}
}
