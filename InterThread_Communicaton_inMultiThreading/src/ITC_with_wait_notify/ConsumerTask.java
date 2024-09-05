package ITC_with_wait_notify;

public class ConsumerTask implements Runnable {
	private Utils u;
	private boolean exit;
	public ConsumerTask(Utils u) {
		this.u=u;
	}

	@Override
	public void run() {
		System.out.println("Thread started "+Thread.currentThread().getName());
		try {
		while(!exit) {
			u.readData();
			Thread.sleep(100);
		}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got exception "+e);
		}
		System.out.println("Thread over "+Thread.currentThread().getName());
	}
	
	public void stop() {
		exit=true;
	}
}
