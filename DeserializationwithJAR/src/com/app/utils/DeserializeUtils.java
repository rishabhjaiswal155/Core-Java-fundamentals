package com.app.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface DeserializeUtils {
	static Object restoreProductDetails(String fileName) throws IOException, ClassNotFoundException {
		File f1=new File(fileName);
		if(f1.exists() && f1.isFile() && f1.canRead()) {
			try(ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f1)))){
				return in.readObject();
			}
		}
		return null;
	}

}
