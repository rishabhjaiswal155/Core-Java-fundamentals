package functionalInterface_lambaExpression;

public class AdditionUtils implements Operation {
	@Override
	public double performAnyOperation(double a,double b) {
		return a+b;
	}
}
