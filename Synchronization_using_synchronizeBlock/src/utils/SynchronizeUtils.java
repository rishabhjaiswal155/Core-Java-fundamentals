package utils;

import java.util.Random;

public class SynchronizeUtils  {
	private static Random r1=new Random();
	
	public synchronized void test() {
		System.out.println("Entered in test: "+Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(40)+100);//Generating random number from 100-139
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+" got exception "+e);
		}
		System.out.println("Exitted test: "+Thread.currentThread().getName());
	}
}
