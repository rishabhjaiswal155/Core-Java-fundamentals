package rules_in_multipleinheritance_usinginterface;

public class C implements A,B {
	@Override
	public double calculate(double a,double b) {
		System.out.println("In abstract method calculate implementation");
		return a+b;
	}
	
	@Override
	public void show() {
		System.out.println("In default duplicate show implementation in class C");
		A.super.show();
		B.super.show();
	}

}
