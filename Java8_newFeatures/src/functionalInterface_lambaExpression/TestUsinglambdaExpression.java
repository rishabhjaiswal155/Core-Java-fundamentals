package functionalInterface_lambaExpression;
import static functionalInterface_lambaExpression.ComputationUtils.computeResult;
public class TestUsinglambdaExpression {

	public static void main(String[] args) {
		System.out.println("Addition= "+computeResult(10, 20, (a,b)->a+b));
		System.out.println("Substraction= "+computeResult(10, 20, (a,b)->a-b));
		System.out.println("Multiplication0= "+computeResult(10, 20, (a,b)->a*b));
		System.out.println("Division= "+computeResult(10, 20, (a,b)->a/b));
	}
}
