package daemon_threads;

import java.io.IOException;

public class RunnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		try {
			for (int i = 0; i < 10; i++) {
				if (Thread.currentThread().getName().equals("two")) {
					System.out.println("Enter Data");
					int data = System.in.read();
				}
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+" executes# "+i);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got exception "+e);
		}
	}
}