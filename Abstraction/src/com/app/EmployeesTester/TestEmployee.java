package com.app.EmployeesTester;

import com.app.Employees.Employee;
import com.app.Employees.HRManager;
import com.app.Employees.SalesManager;
import com.app.Employees.TempWorker;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new SalesManager("Rishabh","Jaiswal",50000,5000);
		System.out.println(e);
		e.computeSal();
		
		Employee e1=new HRManager("Lucky","Jaiswal",70000,10000);
		System.out.println(e1);
		e1.computeSal();
		
		Employee e2=new TempWorker("Guddu","bindya",10000,500);
		System.out.println(e2);
		e2.computeSal();
		

		Employee e3=new TempWorker("babu","bana",20000,1000);
		System.out.println(e3);
		e3.computeSal();
		
		

	}

}
