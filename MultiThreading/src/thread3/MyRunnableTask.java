package thread3;
import static java.lang.Thread.currentThread;
public class MyRunnableTask implements Runnable {
	//implements run() method to provide B.L
	public void run() //throws InterruptedException //
	{
		System.out.println(currentThread().getName()+" starts");
	try {	
	for(int i=0;i<10;i++) {
			System.out.println(currentThread().getName()+" counter #"+i);
			Thread.sleep(500);
		}
	}catch(Exception e) {
		System.out.println(currentThread().getName()+" got exception "+e);
	}
		System.out.println(currentThread().getName()+" over");
	}
}
