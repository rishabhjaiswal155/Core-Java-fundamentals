package default_keyword;

public class MyImplementationClass2 implements Formula{
	@Override
	public double calculate(double a) {
		System.out.println("implements abstract method:calculate()");
		return a*2;
	}
	@Override
	public double sqrt(double a,double b) {
		System.out.println("Override default method");
		return Math.sqrt(a-b);
	}
}
