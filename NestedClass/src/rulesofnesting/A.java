package rulesofnesting;
//typical example of composition(Tight coupling)
public class A {
	//can outer class  contain static and non static data memebers? Yes
	private int i;
	private static int j;
	static {
		j=100;
	}
	//can outer class contain constructor to initialize non static data memeber? yes
	public A(int i) {
		super();
		this.i = i;
	}
//can outer class contain static as well as non static methods? Yes	
	public void outerShow() {
		//It can access static as well as non static data memebers of outer class.
		//it cannot directly access the static as well as non static data members of inner class
		//but can access after instantiating inner class
		B b1=new B(10);
		System.out.println("from outerShow"+i+" "+j+" "+b1.k+" "+B.l);//
	}
	public static void outerShow1() {
		//It can access static data memeber from outer class.
		//But cannot access static data member from innerclass directly.
		//it can be accessed by instantaiting outer class then instantaitaing inner class
		A.B ref=new A(11).new B(22);
		System.out.println("from outerShow1"+j+" "+ref.k);//only j can be accessed
	}
	
public class B{
	private int k;
	//javac cannot allowed to contain static variables
	//It can allow only static constant with expression
	private static final int l=200;
//It doesnot allow Static Initailizer block
//	static {
//		l=200;
//	}
	public B(int k) {
		super();
		this.k = k;
	}
	//inner class can contain non static methods.
	//It can access outer class data variables static as well as non static,also can access inner class static as well as non static variables
	public void innerShow() {
		System.out.println("from innerShow"+i+" "+j+" "+k+" "+l);//All the above can be accessed
	}
	//cannot have any non static method
	/*
	 * public static void innerShow1() {
	 * System.out.println("from innerShow1"+j+" "+l); }
	 */
}
}
