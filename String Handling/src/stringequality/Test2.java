package stringequality;

public class Test2 {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=new String("Hello");
		String s4=new String("HELLO");
		System.out.println(s1==s2);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1==s3);//f
		System.out.println(s1.equals(s3));//f
		System.out.println(s1==s4);//f
		System.out.println(s1.equals(s4));//f
		System.out.println(s1.equalsIgnoreCase(s4));//t
		
		

	}

}
