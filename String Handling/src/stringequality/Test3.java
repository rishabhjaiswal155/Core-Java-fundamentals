package stringequality;

public class Test3 {

	public static void main(String[] args) {
		String s1="hello";
		String s2=new String(s1);
		String s3="hello";
		String s4="HELLO";
		String s5=new String("HELLO");
		System.out.println(s1==s2);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1==s3);//t
		System.out.println(s1.equals(s3));//t
		System.out.println(s1==s4);//f
		System.out.println(s1.equals(s4));//f
		System.out.println(s4==s5);//f
		System.out.println(s4.equals(s5));//t
		System.out.println(s1.equalsIgnoreCase(s4));//t
	}

}
