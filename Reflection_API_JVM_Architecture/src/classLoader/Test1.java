package classLoader;

import java.sql.Date;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Tracing classloading Hierarchy");
		System.out.println("Test1's classLoader "+Test1.class.getClassLoader());
		System.out.println("It's parent class Loader "+Test1.class.getClassLoader().getParent());
		System.out.println("It's ultimate parent class Loader "+Test1.class.getClassLoader().getParent().getParent());
		System.out.println("Checking which classes are loaded by which class loader");
		System.out.println("java.sql.Date class "+Date.class.getClassLoader());
		System.out.println("java.util.List.LinkedList class "+LinkedList.class.getClassLoader());
	}
}
