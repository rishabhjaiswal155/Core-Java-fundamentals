package ITC_with_sleep;

public class ConsumerTask implements Runnable {
	private Utils u;
	private boolean exit;
	public ConsumerTask(Utils u) {
		this.u=u;
	}

	@Override
	public void run() {
		System.out.println("Consumer entered "+Thread.currentThread().getName());
		try {
		while(!exit) {
			u.readData();
			Thread.sleep(100);
		}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got exception "+e);
		}
		System.out.println("Consumer exitted "+Thread.currentThread().getName());
	}
	
	public void stop() {
		exit=true;
	}
}
