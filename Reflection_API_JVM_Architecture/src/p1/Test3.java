package p1;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
			
			Class<Employee> cls=Employee.class;
			
			//displays all accessible fields of Employee Class and its inherited class
			System.out.println("All accessible fields of Employee class");
		    Arrays.stream(cls.getFields()).forEach(System.out::println);
		    
		    //displays all fields including private fields of Employee class but not its inherited class
		    System.out.println("All fields of Employee class");
		    Arrays.stream(cls.getDeclaredFields()).forEach(System.out::println);
		    
		    //displays all the constructors of Employee class
		    System.out.println("all constructors of Employee class");
		    Arrays.stream(cls.getConstructors()).forEach(System.out::println);
		    
		   //displays all accessible methods of Employee class and its inherited class.
		    System.out.println("all accessible method of Employee class");
		    Arrays.stream(cls.getMethods()).forEach(System.out::println);
		    
		    //displays all methods including private methods of Employee class but not its inherited class.
		    System.out.println("All methods of Employee class");
		    Arrays.stream(cls.getDeclaredMethods()).forEach(System.out::println);
		
	}

}
