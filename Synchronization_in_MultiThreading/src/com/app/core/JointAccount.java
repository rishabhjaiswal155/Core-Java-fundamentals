package com.app.core;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "JointAccount [balance=" + balance + "]";
	}
	
	public synchronized void updateBalance(double amount) throws InterruptedException {
		System.out.println("updatation started by "+Thread.currentThread().getName());
	    balance=balance+amount;
	    System.out.println("Cancelling Update after a delay");
	    Thread.sleep(17);
	    balance=balance-amount;
		System.out.println("updatation over by "+Thread.currentThread().getName());
	}
	
	public synchronized double checkBalance() throws InterruptedException {
		System.out.println("checkingBalance started by "+Thread.currentThread().getName()); 
		Thread.sleep(37);
		System.out.println("checkingBalance over by "+Thread.currentThread().getName());  
		return balance;
	}
}
