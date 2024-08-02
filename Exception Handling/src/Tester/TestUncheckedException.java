package Tester;

public class TestUncheckedException {

	public static void main(String[] args) {
		int a=10,b=10;
		try {
		System.out.println("Result="+(a/b));//Arithmetic Exception:Javac does not force to handle unchecked Exception(extending from Runtime Exception).
		String[] names= {"Rishabh","Lucky"};
		System.out.println(names[0]);//ArrayIndexOutofBound Exception:Javac does not force to handle unchecked Exception(extending from Runtime Exception).
		System.out.println(Double.parseDouble("abc1234"));//NumberFormat Exception:Javac does not force to handle unchecked Exception(extending from Runtime Exception).
		System.out.println("try block over...");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("main method over....");
	}
}
