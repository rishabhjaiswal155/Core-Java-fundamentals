package functionalInterface_lambaExpression;
import static functionalInterface_lambaExpression.ComputationUtils.computeResult;
public class TestusingAnnonymousInnerClass {

	public static void main(String[] args) {
		System.out.println("Addition= "+computeResult(10, 20,new Operation() {
			
			@Override
			public double performAnyOperation(double a, double b) {
				return a+b;
			}
		}));
		
		System.out.println("Substraction= "+computeResult(10, 20, new Operation() {
			
			@Override
			public double performAnyOperation(double a, double b) {
				return a-b;
			}
		}));
		
		System.out.println("Mutiplication= "+computeResult(10, 20, new Operation() {
			
			@Override
			public double performAnyOperation(double a, double b) {
				return a*b;
			}
		}));
		
		System.out.println("Division= "+computeResult(10, 20, new Operation() {
			
			@Override
			public double performAnyOperation(double a, double b) {
				return a/b;
			}
		}));
	}
}
