package com.app.core;
public class Employee{
private int id;
private String name;
private double sal;
public Employee(int id,String name,double sal){
this.id=id;
this.name=name;
this.sal=sal;
}
public String getEmpDetails(){
return "Employee details id= "+id+" Name= "+name+" Salary= "+sal;
}
}
