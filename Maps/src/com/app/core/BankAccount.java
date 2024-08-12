package com.app.core;

import java.time.LocalDate;

import com.app.custom_exception.BankingException;

import static com.app.utils.BankValidationRules.*;
public class BankAccount {
	private int actNo;
	private String CustomerName;
	private AcType type;
	private LocalDate creationDate;
	private double balance;
	public BankAccount(int actNo, String customerName, AcType type, LocalDate creationDate, double balance) {
		super();
		this.actNo = actNo;
		CustomerName = customerName;
		this.type = type;
		this.creationDate = creationDate;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [actNo=" + actNo + ", CustomerName=" + CustomerName + ", type=" + type + ", creationDate="
				+ creationDate + ", balance=" + balance + "]";
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
	}
	
	public void withdraw(double amount) throws BankingException {
		validateMinimumBal(this.balance-amount);
		this.balance-=amount;
	}
	
	public void fundsTransfer(BankAccount desAcc,double amount) throws BankingException {
		this.withdraw(amount);
		desAcc.deposit(amount);
	}
}
