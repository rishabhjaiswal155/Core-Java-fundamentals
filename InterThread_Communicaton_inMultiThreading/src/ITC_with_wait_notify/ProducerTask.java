package ITC_with_wait_notify;

public class ProducerTask implements Runnable {
	private Utils u;
	private boolean exit;

	public ProducerTask(Utils u) {
		this.u = u;
	}

	@Override
	public void run() {
		System.out.println("Thread started " + Thread.currentThread().getName());
		try {
			int i = 1;
			while (!exit) {
				u.writeData(new Employee(i, "aa" + i, "R&D", i * 100));
				i++;
				Thread.sleep(20);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exception " + e);
		}
		System.out.println("Thread over " + Thread.currentThread().getName());
	}

	public void stop() {
		exit = true;
	}
}
