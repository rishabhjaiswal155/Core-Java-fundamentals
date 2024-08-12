package com.app.utils;

import com.app.custom_exception.BankingException;

public class BankValidationRules {
	private static final double MIN_BALANCE;
	static {
		MIN_BALANCE=2000;
	}
	public static void validateMinimumBal(double balance) throws BankingException {
		if(balance<MIN_BALANCE)
			throw new BankingException("insufficient Balance!!!!!!");
	}

}
