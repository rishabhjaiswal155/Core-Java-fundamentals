package default_keyword;

public class Test1 {

	public static void main(String[] args) {
		Formula[] formulae= {new MyImplementationClass1(),new MyImplementationClass2()};
		for(Formula f:formulae) {
			System.out.println(f.calculate(15));
			System.out.println(f.sqrt(15, 10));
		}
	}
}
