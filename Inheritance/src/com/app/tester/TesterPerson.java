package com.app.tester;
import com.app.core.*;
public class TesterPerson {

	public static void main(String[] args) {
		Student s=new Student("Rishabh","Jaiswal",2017,"B.Tech",400000,63.50);
		System.out.println(s);//implicitly calling s.toString();
		Faculty f=new Faculty("Madhura","A",20,"Java,Web Based java");
		System.out.println(f);//implicitly calling f.toString();
		
		

	}

}
