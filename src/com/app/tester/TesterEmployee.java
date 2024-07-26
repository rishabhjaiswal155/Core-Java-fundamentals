package com.app.tester;
import java.util.Scanner;
import com.app.core.Employee;
public class TesterEmployee{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee details: id,name,salary");
Employee e1=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
System.out.println(e1.getEmpDetails());
}
}