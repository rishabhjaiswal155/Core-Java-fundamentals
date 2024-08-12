package com.app.tester;

import java.time.LocalDate;
import java.util.HashSet;

import com.app.core.Employee;

public class TestHashSetusingCompositepk {

	public static void main(String[] args) {
		Employee e1=new Employee("pd-101","Rishabh",50000,412,LocalDate.parse("1996-04-22"));
		Employee e2=new Employee("pd-102","Vishal",54000,412,LocalDate.parse("1994-05-22"));
		Employee e3=new Employee("pd-103","Vijay",55000,422,LocalDate.parse("1999-07-28"));
		Employee e4=new Employee("pd-104","Devarkonda",56000,422,LocalDate.parse("2000-03-21"));
		Employee e5=new Employee("pd-105","Siddharth",57000,434,LocalDate.parse("2001-02-27"));
		Employee e6=new Employee("pd-101","Lucky",53000,412,LocalDate.parse("2002-08-15"));
		Employee e7=new Employee("pd-103","Hulsure",51000,422,LocalDate.parse("2007-09-22"));
		Employee e8=new Employee("pd-102","Ingle",59000,412,LocalDate.parse("2009-04-12"));
		HashSet<Employee> ehs=new HashSet<>();
		System.out.println("Added:"+ehs.add(e1));//t
		System.out.println("Added:"+ehs.add(e2));//t
		System.out.println("Added:"+ehs.add(e3));//t
		System.out.println("Added:"+ehs.add(e4));//t
		System.out.println("Added:"+ehs.add(e5));//t
		System.out.println("Added:"+ehs.add(e6));//f
		System.out.println("Added:"+ehs.add(e7));//f
		System.out.println("Added:"+ehs.add(e8));//f
		System.out.println("Size of hashSet:"+ehs.size());
		System.out.println("HashSet"+ehs+" ");
	}

}
