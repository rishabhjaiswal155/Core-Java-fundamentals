package default_keyword;

public interface Formula {
	double calculate(double a);
	default double sqrt(double a,double b) {
		System.out.println("default method implementation in interface");
		return Math.sqrt(a+b);
	}
}
