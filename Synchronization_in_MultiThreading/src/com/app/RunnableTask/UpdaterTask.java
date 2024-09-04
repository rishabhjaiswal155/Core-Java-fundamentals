package com.app.RunnableTask;

import com.app.core.JointAccount;

public class UpdaterTask implements Runnable {
	private JointAccount account;
	public UpdaterTask(JointAccount account) {
		super();
		this.account = account;
		System.out.println("Constructor got invoked by "+Thread.currentThread().getName());
	}
	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName()+" started");
	try {
		while(true) {
		account.updateBalance(5000);
		Thread.sleep(53);
		}
	} catch (Exception e) {
		System.out.println(Thread.currentThread().getName()+" got exception "+e);
	}
	System.out.println(Thread.currentThread().getName()+" over");
	}
}
