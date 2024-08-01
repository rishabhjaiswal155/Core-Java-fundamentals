package p4;
public class D implements C {

	@Override
	public double sum(double a, double b) {
		return a+b;
	}

	@Override
	public void test(int num) {
		if(num%2==0) {
			System.out.println("Even");
		}else
			System.out.println("Odd");
	}

	@Override
	public double sub(double a, double b) {
		return a-b;
	}

}
