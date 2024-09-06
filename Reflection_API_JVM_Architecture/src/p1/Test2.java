package p1;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter fully Qualified name of Class or Interface");
			Class<?> cls=Class.forName(sc.next());
			if(!(cls.isInterface())) {
			//API's of java.lang.reflection.Modifier
			int modifiers=cls.getModifiers();//to get int value of modifiers of class/interface
			System.out.println(Modifier.isPublic(modifiers)?"Public":"pkg-private");
			System.out.println(Modifier.isAbstract(modifiers)?"Abstract":"Concrete");
			System.out.println(Modifier.isFinal(modifiers)?"Final":"Not final");
			
			//to print superclass name
			System.out.println("SuperClass Name "+cls.getSuperclass().getName());
			System.out.println("Interface Implemented");
			Arrays.stream(cls.getInterfaces()).forEach(System.out::println);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
