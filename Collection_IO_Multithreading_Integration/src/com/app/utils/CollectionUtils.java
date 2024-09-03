package com.app.utils;

import static com.app.core.Subject.CPP;
import static com.app.core.Subject.CSHARP;
import static com.app.core.Subject.DBT;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.REACT;
import static java.time.LocalDate.parse;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.app.core.Student;

public interface CollectionUtils {
	static Map<String,Student> populateMap(){
		HashMap<String,Student> students=new HashMap<>();
		students.put("DAC-100", new Student("DAC-100","Rishabh",parse("1996-04-22"),JAVA,6.75));
		students.put("DAC-103", new Student("DAC-103","Vishal",parse("1999-09-19"),CSHARP,7.85));
		students.put("DAC-102", new Student("DAC-102","Shreyash",parse("2000-05-17"),REACT,7.05));
		students.put("DAC-101", new Student("DAC-101","Atharva",parse("2002-02-27"),DBT,8.75));
        students.put("DAC-105", new Student("DAC-105","Pranav",parse("1998-08-22"),CPP,6.75));
		students.put("DAC-104", new Student("DAC-104","Soham",parse("1995-03-29"),JAVA,5.75));
		return students; 
	}
	
	static List<Student> sortStudentsPerDOb(Map<String,Student> students){
		return students.values().stream().sorted(Comparator.comparing(Student::getDob)).collect(Collectors.toList());
	}
	
	static List<Student> sortStudentsPerCgpa(Map<String,Student> students){
		return students.values().stream().sorted(Comparator.comparing(Student::getCgpa)).collect(Collectors.toList());
	}

}
