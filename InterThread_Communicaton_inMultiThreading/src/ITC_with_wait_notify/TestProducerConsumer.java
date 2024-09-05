package ITC_with_wait_notify;

import java.io.IOException;

public class TestProducerConsumer {

	public static void main(String[] args) throws InterruptedException, IOException {
		Utils u=new Utils();//shared resource
		String names[]= {"Producer","Consumer"};
		ProducerTask p1=new ProducerTask(u);
		Thread t1=new Thread(p1,names[0]);
		t1.start();
		Thread.sleep(10);
		ConsumerTask c1=new ConsumerTask(u);
		Thread t2=new Thread(c1,names[1]);
		t2.start();
		System.out.println("press Enter to stop");
		System.in.read();//blocked on i/p
		p1.stop();
		c1.stop();
		System.out.println("main waiting for Producer thread for complete the execution for maximun 1 sec");
		t1.join(1000);
		System.out.println("main waiting for Consumer thread for complete the execution for maximun 1 sec");
		t2.join(1000);
		if(t1.isAlive())
			t1.interrupt();
		if(t2.isAlive())
			t2.interrupt();
		t1.join();
		t2.join();
		System.out.println("main over");
	}
}
