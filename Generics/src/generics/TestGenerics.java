package generics;

public class TestGenerics {

	public static void main(String[] args) {
		Holder<Integer> h1=new Holder<>(1234);
		System.out.println(h1.getClass());
		System.out.println(h1.getRef().getClass());
		int data=h1.getRef();//Integer---->int AutoUnboxing
		System.out.println(data);
		
		Holder<String> h2=new Holder<>("Hello Rishabh");
		System.out.println(h2.getClass());
		System.out.println(h2.getRef().getClass());
		String s1=h2.getRef();//No conversion
		System.out.println(s1);
		//Thanks to Generics,JavaC error and cannot get classCast exception at run time
	//	h1=h2;//here h1 is of Integer type and h2 is of tring type so type mismatch error
	}
}
