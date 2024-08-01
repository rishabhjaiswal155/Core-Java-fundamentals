package p2;

public class C implements A, B {

	@Override
	public double add(double a, double b, double c) {
		return a+b+c;
	}

	@Override
	public double add(double a, double b) {
		return a+b;
	}

}
