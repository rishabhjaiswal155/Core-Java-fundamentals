package functionalInterface_lambaExpression;

import java.util.Arrays;
import java.util.LinkedList;
public class TestforEachusinglambdaExpression {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(10,20,1,65,98,74,10,3));
		list.forEach(t->System.out.print(t+" "));
	}
}
