package rules_regarding_staticMethod_inInterface;

public class Test1 {

	public static void main(String[] args) {
		Formula ref=new MyImplementationClass();
		System.out.println(ref.calculate(15, 10));
		System.out.println(ref.sqrt(15, 10));
		Formula.print("Hii");
		MyImplementationClass.print("Hello");
	}
}
