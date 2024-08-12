package com.app.utils;

import java.time.LocalDate;
import java.util.HashSet;

import com.app.core.Employee;

public class EmployeeUtils {
	public static HashSet<Employee> populateEmployee() {
		HashSet<Employee> ehs=new HashSet<>();
		ehs.add(new Employee("pd-101","Rishabh",50000,412,LocalDate.parse("1996-04-22")));
		ehs.add(new Employee("pd-102","Vishal",54000,412,LocalDate.parse("1994-05-22")));
		ehs.add(new Employee("pd-103","Vijay",55000,422,LocalDate.parse("1999-07-28")));
		ehs.add(new Employee("pd-104","Devarkonda",56000,422,LocalDate.parse("2000-03-21")));
		ehs.add(new Employee("pd-105","Siddharth",57000,434,LocalDate.parse("2001-02-27")));
		ehs.add(new Employee("pd-101","Lucky",53000,412,LocalDate.parse("2002-08-15")));
		ehs.add(new Employee("pd-103","Hulsure",51000,422,LocalDate.parse("2007-09-22")));
		ehs.add(new Employee("pd-102","Ingle",59000,412,LocalDate.parse("2009-04-12")));
		return ehs;
	}
}
