package default_keyword;

public class MyImplementationClass1 implements Formula{
	@Override
	public double calculate(double a) {
		System.out.println("Implements abstract method:calculate()");
		return a*a;
	}
}
