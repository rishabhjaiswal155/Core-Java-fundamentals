package non_generics;

public class TestNonGeneric {

	public static void main(String[] args) {
		Holder h1=new Holder(1234);//Holder can hold reference of any time(primitive/reference)
		System.out.println(h1.getClass());
		System.out.println(h1.getRef().getClass());
		int data=(Integer)h1.getRef();//Explicit down cast from Object--->Integer then Integer---->int(Implicit AutoUnboxing)
		System.out.println(data);
		
		Holder h2=new Holder("Hello");
		System.out.println(h2.getClass());
		System.out.println(h2.getRef().getClass());
		String s=(String)h2.getRef();//Object----->String down cast then no conversion
		System.out.println(s);
		
		h1=h2;//Both h1 and h2 are off Holder type hence no JavaC error
		//Now h1 refer to String type and we are explicitlty type-casting it to Integer
		//Which causes ClassCastException at runtime String cannot be Cast to Integer
		int data1=(Integer)h1.getRef();
	}
}
