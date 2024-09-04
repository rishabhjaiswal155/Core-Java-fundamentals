package utils;
import java.io.IOException;
public class TestSynchUtils4 {
	private static boolean exit=false;
	public static void main(String[] args) throws InterruptedException, IOException {
		SynchronizeUtils utils=new SynchronizeUtils();
		SynchronizeUtils utils2=new SynchronizeUtils();
		
		//creating threads using ctor Thread(Runnable instance,String name) using lambda expression
		Thread t1=new Thread(()->{
			while(!exit) {
				utils.test();
			}
		},"t1");
		
		Thread t2=new Thread(()->{
			while(!exit) {
				utils2.testMeAgain();
			}
		},"t2");
		//here both t1 and t2 threads are in NEW state
		
		t1.start();//state:Runnable
		t2.start();//state:Runnable
		//main blocked on IO
		System.out.println("press enter button to stop");
		System.in.read();
	    //main blocked on join
		System.out.println("main waiting for children thread to complete execution");
		System.out.println("stoping execution of children threads:exit");
		exit=true;
		//no orphans
		t1.join();
		t2.join();
		System.out.println("main over");	
	}
}
