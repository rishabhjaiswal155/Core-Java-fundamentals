package thread2;
import static java.lang.Thread.currentThread;
public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(currentThread());//[main,5,main]
		//creating childthreads
		ChildThread t1=new ChildThread("one");
		ChildThread t2=new ChildThread("two");
		ChildThread t3=new ChildThread("three");
		ChildThread t4=new ChildThread("four");//state:New Runnable Thread=1
//		t1.start();//IllegalThreadStateException as we cannot restart already started threads
//		t2.start();
//		t3.start();
//		t4.start();//state:Runnable Runnable Threads=5 [1 main+4 childthreads]
		//B.L
		for(int i=0;i<10;i++) {
			System.out.println(currentThread().getName()+" counter #"+i);
			Thread.sleep(200);
		}
		System.out.println("main thread waiting for child threads to complete execution");
		System.out.println(t1.isAlive()+" "+t4.isAlive());//boolean retunning method to check thread is alive ot dead
		t1.join();//main blocked on join waiting for t1's completion
		t2.join();//main blocked on join waiting for t2's completion
		t3.join();//main blocked on join waiting for t3's completion
		t4.join();//main blocked on join waiting for t4's completion
		System.out.println(t1.isAlive()+" "+t4.isAlive());
		System.out.println("main Over......");
	}
}
