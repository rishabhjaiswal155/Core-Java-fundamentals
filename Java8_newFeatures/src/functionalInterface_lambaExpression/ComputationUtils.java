package functionalInterface_lambaExpression;

public interface ComputationUtils {
	static double computeResult(double a,double b,Operation op) {
		return op.performAnyOperation(a, b);
	}
}
