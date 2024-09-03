package thread1;

public class ChildThread extends Thread {
	public ChildThread(String name) {
		super(name);//state:NEW
		start();//state:Runnable
	}
	
	@Override
	public void run() //throws InterruptedException // overriding form of method cannot throw any new Checked Exception
	{
		System.out.println(getName()+" starts");
	try {	
	for(int i=0;i<10;i++) {
			System.out.println(getName()+" counter #"+i);
			Thread.sleep(500);
		}
	}catch(Exception e) {
		System.out.println(getName()+" got exception "+e);
	}
		System.out.println(getName()+" over");
	}
}
