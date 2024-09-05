package no_ITC;

public class Utils {
	private Employee e;
	public synchronized void writeData(Employee ref) throws InterruptedException {
		System.out.println("w entered "+Thread.currentThread().getName());
		Thread.sleep(30);
		e=ref;
		System.out.println("write the data "+e);
		System.out.println("w exitted "+Thread.currentThread().getName());
	}
	
	public synchronized Employee readData() throws InterruptedException {
		System.out.println("r entered "+Thread.currentThread().getName());
		System.out.println("read the data "+e);
		Thread.sleep(100);
		System.out.println("r exitted "+Thread.currentThread().getName());
		return e;
	}
}
