package com.app.tester;

import java.util.HashSet;

import com.app.core.Employee;

public class TestHashSet2 {

	public static void main(String[] args) {
		//Observations when Algorithm follows mandatory part i.e every equals object must produce same hashcode.
		//as well as Optional part of contract i.e every non equals object should produce distinct hashCode.
		//In this.we get constant time performance.
		Employee e1=new Employee("pd-001","Rishabh",50000);
		Employee e2=new Employee("pd-002","Hitesh",60000);
		Employee e3=new Employee("pd-003","himanshu",70000);
		Employee e4=new Employee("pd-004","Vishal",80000);
		Employee e5=new Employee("pd-001","Sujit",90000);
		Employee e6=new Employee("pd-002","Sujit",90000);
		Employee e7=new Employee("pd-003","Sujit",90000);
		HashSet<Employee> ehs=new HashSet<>();//must override equals and hashCode to detect duplicate.
		System.out.println("Added:"+ehs.add(e1));//t hc:1 eq:0
		System.out.println("Added:"+ehs.add(e2));//t hc:1 eq:0
		System.out.println("Added:"+ehs.add(e3));//t hc:1 eq:0
		System.out.println("Added:"+ehs.add(e4));//t hc:1 eq:0
		System.out.println("Added:"+ehs.add(e5));//f hc:1 eq:1
		System.out.println("Added:"+ehs.add(e6));//f hc:1 eq:1
		System.out.println("Added:"+ehs.add(e7));//f hc:1 eq:1
		System.out.println("Size:"+ehs.size());//4
		System.out.println("Checking if mandatory as well as optional part of contract  follows");
		System.out.println(e1.equals(e5));
		System.out.println(e1.hashCode()+" "+e5.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()+" "+e2.hashCode());
	}
}
