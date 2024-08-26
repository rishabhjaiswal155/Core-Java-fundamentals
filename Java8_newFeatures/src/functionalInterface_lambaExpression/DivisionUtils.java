package functionalInterface_lambaExpression;

public class DivisionUtils implements Operation {
	@Override
	public double performAnyOperation(double a,double b) {
		return a/b;
	}
}
