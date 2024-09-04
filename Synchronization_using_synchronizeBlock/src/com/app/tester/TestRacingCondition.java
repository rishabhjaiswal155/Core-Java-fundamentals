package com.app.tester;

import com.app.RunnableTask.CheckerTask;
import com.app.RunnableTask.UpdaterTask;
import com.app.core.JointAccount;

public class TestRacingCondition {

	public static void main(String[] args) throws InterruptedException {
		//create single instance of JointAccount(shared Resource)
		JointAccount account=new JointAccount(5000);
		//create Threads: Thread(Runnable instance,String name)
		Thread t1=new Thread(new UpdaterTask(account),"Customer1");//state:NEW
		Thread t2=new Thread(new CheckerTask(account),"Customer2");//state:NEW
		//start the threads
		t1.start();//State:Runnable
		t2.start();//State:Runnable
		System.out.println("main waiting for children threads to complete the execution");
		t1.join();
		t2.join();
		System.out.println("main over");
	}
}
