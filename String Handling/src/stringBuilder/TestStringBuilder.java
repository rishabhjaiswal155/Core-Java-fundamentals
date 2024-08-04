package stringBuilder;

public class TestStringBuilder {

	public static void main(String[] args) {
	
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("Hello Rishabh");
		System.out.println("Length="+sb1.length()+" "+"Capacity="+sb1.capacity());
		StringBuilder sb3=sb1.append("jaiswal");
		System.out.println(sb1);
		System.out.println(sb3);
		System.out.println(sb1==sb3);
		//it checks referential equality not content
		System.out.println(sb1.equals(sb3));//it is inherited from object class not override
		//Method chaining
		StringBuilder sb4=sb1.append(true).append(1.236).append(5.6f).append("Rishabh");
		System.out.println(sb1);
		System.out.println(sb4);
		System.out.println(sb1.insert(0,"Hii"));
		System.out.println(sb2.delete(0, 5));
		System.out.println(sb1.compareTo(sb3));
	}
}
