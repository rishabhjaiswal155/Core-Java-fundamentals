package p1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter the fully qualified name of the class or interface");
		//1.first way to get loaded class information by using Class.forName(F.Q className)
		Class<?> cls=Class.forName(sc.next());
		System.out.println(cls.getName());
		System.out.println(cls.isInterface()?"Interface":"Not Interface");
		
		//2.second way to get loaded class information by getClass()
		LocalDateTime datetime=LocalDateTime.now();
		Class<?> cls2= datetime.getClass();
		System.out.println(cls2.getName());
		System.out.println(datetime);
		
		//3.Third way to get loaded class information by Class Literal className.class
		Class<String> cls3=String.class;
		System.out.println(cls3.getName());
		
		//for 2D Array
		int [][] data= {{1,2},{4,5,6,7}};
		System.out.println(data.getClass().getName());
		
		//for Primitive Datatype
		Class<?> doublecls=double.class;
		System.out.println(doublecls.getName());
	
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
