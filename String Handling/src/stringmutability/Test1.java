package stringmutability;

public class Test1 {

	public static void main(String[] args) {
		//Strings are immutable in nature.
		//String reference are mutable and String objects are immutable.
		String s=new String("hello");
		s.concat("how are you!!!");
		String s1=s.concat("how are you!!!");
		System.out.println(s);
		System.out.println(s1);
		s+="12345";
		System.out.println(s);
		String s2=s.toUpperCase();
		System.out.println(s);
		System.out.println(s2);
		String s3=s1.replace('h', 't');
		System.out.println(s1);
		System.out.println(s3);
	}
}
