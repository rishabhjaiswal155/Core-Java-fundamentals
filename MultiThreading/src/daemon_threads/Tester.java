package daemon_threads;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread details"+Thread.currentThread());
		RunnableTask task=new RunnableTask();
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	Thread.sleep(10000);
	t1.interrupt();
	t2.interrupt();
	t3.interrupt();
	System.out.println("main over");
	}

}
