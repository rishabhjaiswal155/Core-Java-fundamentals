package com.app.RunnableTask;

import com.app.core.JointAccount;

public class CheckerTask implements Runnable {
	private JointAccount account;
	public CheckerTask(JointAccount account) {
		super();
		this.account = account;
		System.out.println("Constructor got invoked by "+Thread.currentThread().getName());
	}
	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName()+" started");
	try {
		while(true)
		{
			synchronized (account) {
				double balance=account.checkBalance();
				if(balance!=5000) {
					System.out.println("Invalid Balance!!!!!");
					System.exit(-1);
				}	
			}
			Thread.sleep(57);
		}
	} catch (Exception e) {
		System.out.println(Thread.currentThread().getName()+" got exception "+e);
	}
	System.out.println(Thread.currentThread().getName()+" over");
	}
}
