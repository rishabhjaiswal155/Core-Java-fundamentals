package p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test4 {

	public static void main(String[] args) throws Exception {
		Class<Employee> empcls=Employee.class;
		System.out.println("invoke default constructor of Employee class");
		Constructor<Employee> empctr1=empcls.getConstructor();
		Employee e1=empctr1.newInstance();
		System.out.println(e1);
		
		System.out.println("invoke parameterize constuctor of Employee class");
		Constructor<Employee> empctr2=empcls.getConstructor(String.class,double.class);
		Employee e2=empctr2.newInstance("Rishabh",50000);
		System.out.println(e2);
		
		System.out.println("Dynamic Method Invokation of Employee class");
		//get the private method
		Method updateMethod=empcls.getDeclaredMethod("updateSalary",double.class);

		//get the permission to modify
		
		updateMethod.setAccessible(true);
		
		//invoke the method DMI
		
		updateMethod.invoke(e2, 75000);
		System.out.println(e2);
	}

}
