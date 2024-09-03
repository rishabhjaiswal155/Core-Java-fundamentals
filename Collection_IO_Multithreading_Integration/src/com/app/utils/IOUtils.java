package com.app.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Student;

public interface IOUtils {
static void storeStudentDetails(List<Student> students,String fileName) throws IOException {
	try(PrintWriter pw=new PrintWriter(new FileWriter(fileName))){
		students.forEach(pw::println);
		System.out.println("stored  sortedStudent details in text file");
	}
}
}
