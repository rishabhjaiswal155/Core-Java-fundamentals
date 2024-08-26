package functionalInterface_lambaExpression;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Consumer;

public class TestforEachusingAnonymousInnerClass {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(10,20,1,65,98,74,10,3));
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
		});
	}
}
