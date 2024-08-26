package rules_regarding_staticMethod_inInterface;

public class MyImplementationClass implements Formula {
	@Override
	public double calculate(double a,double b) {
		return a+b;
	}
	static void print(String msg) {
       System.out.println("Printing a message "+msg+" from MyImplementationClass");
       Formula.print("Bye");
	}
}
