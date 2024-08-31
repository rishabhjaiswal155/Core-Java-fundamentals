package com.app.utils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.products.Product;

public interface SerializeDeserializeUtils {
static void storeProductDetails(Map<Integer,Product> map,String fileName) throws IOException {
	try(ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
		out.writeObject(map);
	}
}
}
