package com.app.tester;

import static com.app.utils.BankAccountUtils.populateBankAccount;

import java.util.HashMap;

import com.app.core.BankAccount;

public class TestHashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,BankAccount> hm=populateBankAccount();
		System.out.println(hm.size()+"\n"+hm);

	}

}
