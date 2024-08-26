package functionalInterface_lambaExpression;
import static functionalInterface_lambaExpression.ComputationUtils.computeResult;
public class TestByCreatingSeprateClass {

	public static void main(String[] args) {
		System.out.println("Addition= "+computeResult(10, 20,new AdditionUtils()));
		System.out.println("Substraction= "+computeResult(10, 20, new SubstractionUtils()));
		System.out.println("Multiplication= "+computeResult(10, 20, new MultiplicationUtils()));
		System.out.println("Division= "+computeResult(10, 20, new DivisionUtils()));
	}
}
