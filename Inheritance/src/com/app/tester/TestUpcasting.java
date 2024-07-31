package com.app.tester;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class TestUpcasting {

	public static void main(String[] args) {
		//Indirect referencing:Upcasting
		Person p=new Student("Lucky","Jaiswal",2019,"B.com",10000,60.2);
		System.out.println(p);
		Person p1=new Faculty("Sachin","wattamwar",6,"DSD,JAVA");
		System.out.println(p1);
	}

}
