package ITC_with_wait_notify;

public class Utils {
	private boolean dataReady;//Default:false
	private Employee e;
	public synchronized void writeData(Employee ref) throws InterruptedException {
		System.out.println("w entered "+Thread.currentThread().getName());
		while(dataReady)//dataReady: false i.e writeData can be performed 
		this.wait();//blocked on wait: outside the monitor i.e releases the processor and lock
		//producing the data
		e=ref;
		System.out.println("write the data "+e);
		System.out.println("w exitted "+Thread.currentThread().getName());
		dataReady=true;//now the readData can be performed
		this.notify();//sending interrupt to a thread to wake up
	}
	
	public synchronized Employee readData() throws InterruptedException {
		System.out.println("r entered "+Thread.currentThread().getName());
		while(!dataReady)//dataReady=true can perform readData
		this.wait();//blocked on wait  //outside the monitor releases the lock and processor
		//consuming the data
		System.out.println("read the data "+e);
		System.out.println("r exitted "+Thread.currentThread().getName());
		dataReady=false;
		this.notify();//sending interrupt to a thread to wake up
		return e;
	}
}
