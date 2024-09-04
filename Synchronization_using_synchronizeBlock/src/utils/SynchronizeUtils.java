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
	
	public synchronized void testMe() {
		System.out.println("Entered in testMe: "+Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(15)+1);//Generating random number from 1-14
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+" got exception "+e);
		}
		System.out.println("Exitted testMe: "+Thread.currentThread().getName());
	}
	

	public  void testMeAgain() {
		System.out.println("Entered in testMeAgain: "+Thread.currentThread().getName());
		try {
			Thread.sleep(r1.nextInt(15)+1);//Generating random number from 1-14
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+" got exception "+e);
		}
		System.out.println("Exitted testMeAgain: "+Thread.currentThread().getName());
	}
}
