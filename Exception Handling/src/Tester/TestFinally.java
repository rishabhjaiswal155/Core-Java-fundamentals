package Tester;

public class TestFinally {

	public static void main(String[] args) {
	try {
		System.out.println("In main method's try");
		testMe();//also below these never executes if jvm terminates after System.exit(0);
		System.out.println("In main method");
		System.out.println("main method's try over...");
	}catch(Exception e) {
		System.out.println(e);
	}finally {
		System.out.println("main method's finally");
	}
	System.out.println("main method's over....");
	}
	
	public static void testMe() throws InterruptedException {
      try {
    	  System.out.println("In testMe method's try");
    	  Thread.sleep(5000);
    	  String[] names= {"aa","bb"};
    	  System.out.println(names[1]);
    	  boolean flag=true;
    	  if(flag)
    		 // System.exit(0);//if jvm terminates then below this never executes
    		  return;
    	  System.out.println("testMe method's try over....");
      }finally {
    	  System.out.println("In testMe method's finally");
      }
      System.out.println("testmMe method's over");
	}
}
