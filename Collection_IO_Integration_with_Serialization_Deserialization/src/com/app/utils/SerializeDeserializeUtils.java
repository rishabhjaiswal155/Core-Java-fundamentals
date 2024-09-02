package com.app.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.products.Product;
import static com.app.utils.ProductUtils.*;
public interface SerializeDeserializeUtils {
static void storeProductDetails(Map<Integer,Product> map,String fileName) throws IOException {
	try(ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
		out.writeObject(map);
	}
}
@SuppressWarnings("unchecked")
static Map<Integer,Product> restoreproductDetails(String fileName) throws ClassNotFoundException, IOException {
		File f1=new File(fileName);
		if(f1.exists() && f1.isFile() && f1.canRead()) {
			try(ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f1)))){
				return (HashMap<Integer,Product>)in.readObject();
			}
		}
		return populateMapfromList(populateData());
	}
}
