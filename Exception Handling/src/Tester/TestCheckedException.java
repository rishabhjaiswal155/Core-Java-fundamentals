package Tester;

public class TestCheckedException {

	public static void main(String[] args) throws InterruptedException {
		//Checked Exception can be handle in two ways:1.using try..catch block 2.using throws keyword
		//only checked Exception can be throws using throws Keyword in method Definition.
		System.out.println("Before sleep");
//		try {
		Thread.sleep(5000);//InteruptedException JavaC forces to handle Checked Exception(not extending from Runtime Exception)
		System.out.println("After sleep");
//		System.out.println("End of try...");
//		}
//catch(InterruptedException e) {
//			System.out.println("sleep Interrupted!!!"+e);
//		}
	}
}
