package p1;

public class TestWrapper {

	public static void main(String[] args) {
		//Integer i1=new Integer("12346");//Deprecated
		Integer i1=Integer.valueOf(12345);//int->Integer(Boxing)explicitly by programmer
		System.out.println(i1);
		int data=i1.intValue();//Integer-->int(unBoxing)explicitly by programmer
		System.out.println(data);
		Integer i2=12345;//int--->Integer(AutoBoxing)implicity by javaC
		System.out.println(i2);
		int data1=i2;//Integer--->int(Autounboxing)implicity by javaC
		System.out.println(data1);
		Integer i=Integer.valueOf("12345");//String-->Integer(using parsing ApI)
		System.out.println(i);
		String s="12345";
		System.out.println(s);
		//s++;//javac error javac doesnot support pointer/reference arithmetic
		i1++;//Integer--->int(Auto-unboxing) then increment then int---->Integer(AutoBoxing)
		System.out.println(i1);
		Boolean flag=true;//boolean--->Boolean(AutoBoxing)
		System.out.println(flag.getClass());
		Double d1=234.567;//double---->Double(AutoBoxing)
		System.out.println(d1);
		float f1=234.57f;
		double d2=f1;//float--->double(widening)
		System.out.println(d2);
	//d1=f1;//float--->Float(AutoBoxing) then Float----->x----->Double:Javac
		d1=(double)f1;//float----->double(widening Explicitly) then double--->Double(AutoBoxing implicitly)
		Number n1=1234.56;//double---->Double(AutoBoxing) then Double----->Number(upcasting)
		System.out.println(n1.getClass());
		n1=23456;//int----->Integer(AutoBoxing)------>Number(upcasting)
		Object o=1234.5f;//float----->Float(AutoBoxing)-------->Number(upcasting)------>Object(upcasting).
		System.out.println(o.getClass());
		o="Rishabh";//String----->Object(upcasting)
		o=true;//boolean----->Boolean(AutoBoxing)--------->Object(upcasting)
	}
}
