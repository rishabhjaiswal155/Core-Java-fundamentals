package ITC_with_sleep;

public class Utils {
	private boolean dataReady;//Default:false
	private Employee e;
	public synchronized void writeData(Employee ref) throws InterruptedException {
		System.out.println("w entered "+Thread.currentThread().getName());
		while(dataReady)//dataReady: false i.e writeData can be performed 
		Thread.sleep(30);//blocked on sleep: inside the monitor
		//producing the data
		e=ref;
		System.out.println("write the data "+e);
		System.out.println("w exitted "+Thread.currentThread().getName());
		dataReady=true;//now the readData can be performed
	}
	
	public synchronized Employee readData() throws InterruptedException {
		System.out.println("r entered "+Thread.currentThread().getName());
		while(!dataReady)//dataReady=true can perform readData
		Thread.sleep(100);//blocked on sleep //outside the monitor
		//consuming the data
		System.out.println("read the data "+e);
		System.out.println("r exitted "+Thread.currentThread().getName());
		dataReady=false;
		return e;
	}
}
