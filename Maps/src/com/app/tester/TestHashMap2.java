package com.app.tester;

import static com.app.utils.PopulateBankAccount.populateBankAccount;

import java.util.HashMap;

import com.app.core.BankAccount;

public class TestHashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,BankAccount> hm=populateBankAccount();
		System.out.println(hm.size());
		System.out.println(hm);

	}

}
