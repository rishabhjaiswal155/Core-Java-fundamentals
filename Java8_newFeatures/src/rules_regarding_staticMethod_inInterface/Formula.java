package rules_regarding_staticMethod_inInterface;

public interface Formula {
	double calculate(double a,double b);
	default double sqrt(double a,double b) {
		return Math.sqrt(a+b);
	}
	static void print(String msg) {
		System.out.println("printing a message "+msg+" from static method print of Interface Formula");
	}
}
