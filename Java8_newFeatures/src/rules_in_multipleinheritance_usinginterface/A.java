package rules_in_multipleinheritance_usinginterface;

public interface A {
	double calculate(double a,double b);
	default void show() {
		System.out.println("In default show() implementation in interface A");
	}
}
