package p1;

public class C implements A, B {

	@Override
	public double add(double a, double b) {
		System.out.println(A.DATA+" "+B.DATA);
		return a+b;
	}

}
