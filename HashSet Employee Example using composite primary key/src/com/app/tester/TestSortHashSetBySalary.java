package com.app.tester;

import static com.app.utils.EmployeeUtils.populateEmployee;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.app.core.Employee;

public class TestSortHashSetBySalary {

	public static void main(String[] args) {
		HashSet<Employee> employees=populateEmployee();
		TreeSet<Employee> ets=new TreeSet<>(new Comparator<Employee>(){
			@Override
			public int compare(Employee e1,Employee e2) {
				if(e1.getSalary()>e2.getSalary())
					return -1;
				if(e1.getSalary()==e2.getSalary())
					return 0;
				return 1;
			}
	});

		ets.addAll(employees);
		System.out.println("TreeSet:"+ets);
}
}