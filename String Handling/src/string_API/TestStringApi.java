package string_API;

import java.util.Arrays;

public class TestStringApi {

	public static void main(String[] args) {
		String s1=new String("hello, Rishabh,!!Enjoying ,Java");
		String s2=new String("hello jaiswal");
		String s3="hello Jaiswal";
		String[] names= {"Rishabh","Sonam","Richa","Surabhi","Vishal"};
		System.out.println("char at index="+s1.charAt(7));
		System.out.println(names[0].compareTo(names[2]));
		System.out.println(names[1].compareTo(names[3]));
		System.out.println(names[2].compareTo(names[4]));
		System.out.println(names[0].compareTo(names[3]));
		System.out.println(s2.contains("jais"));
		System.out.println(s1.startsWith("he")+" "+s2.endsWith("wal"));
		System.out.println(s3==s2);
		System.out.println(s3.equals(s2));
		System.out.println(s1.indexOf("R")+" "+s1.indexOf("J", 3));
		System.out.println(s1.lastIndexOf("j"));
		System.out.println("Length= "+s1.length());
		System.out.println(Arrays.toString(s1.split(",")));
		System.out.println("substring of s1= "+s1.substring(0, 10));
		System.out.println(s1.toUpperCase());
	}
}
