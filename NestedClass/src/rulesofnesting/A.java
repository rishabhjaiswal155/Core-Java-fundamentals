package rulesofnesting;

public class A {
	private int i;
	private static int j;
	static {
		j=100;
	}
	public A(int i) {
		super();
		this.i = i;
	}
	
	public void outerShow() {
		System.out.println("from outerShow"+i+" "+j);
	}
	public static void outerShow1() {
		System.out.println("from outerShow1"+j);//only j can be accessed
	}
	
public class B{
	private int k;
	private static final int l=200;

//	static {
//		l=200;
//	}
	public B(int k) {
		super();
		this.k = k;
	}
	
	public void innerShow() {
		System.out.println("from innerShow"+i+" "+j+" "+k+" "+l);//All the above can be accessed
	}
	//cannot have any non static member
	/*
	 * public static void innerShow1() {
	 * System.out.println("from innerShow1"+j+" "+l); }
	 */
}
}
