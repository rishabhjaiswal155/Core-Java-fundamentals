package com.app.utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.core.AcType;
import com.app.core.BankAccount;
import com.app.custom_exception.BankingException;

public class BankAccountUtils {
	public static HashMap<Integer,BankAccount> populateBankAccount(){
		HashMap<Integer,BankAccount> hm=new HashMap<>();
		System.out.println("Added using put");
		System.out.println("Added: "+hm.put(100, new BankAccount(100,"Mr. Rishabh",AcType.SAVINGS,LocalDate.parse("2023-12-03"),555000)));
		System.out.println("Added: "+hm.put(101, new BankAccount(101,"Mr. Vijay",AcType.SAVINGS,LocalDate.parse("2024-10-03"),605000)));
		System.out.println("Added: "+hm.put(102, new BankAccount(102,"Mr. Vishal",AcType.CURRENT,LocalDate.parse("2022-06-03"),15000)));
		System.out.println("Added: "+hm.put(103, new BankAccount(103,"Mr. Siddharth",AcType.SAVINGS,LocalDate.parse("2021-07-03"),57000)));
		System.out.println("Added: "+hm.put(104, new BankAccount(104,"Mr. joseph",AcType.FD,LocalDate.parse("2013-08-03"),155000)));
		System.out.println("Added: "+hm.put(105, new BankAccount(105,"Mr. Pujara",AcType.DMAT,LocalDate.parse("2002-09-03"),255000)));
		System.out.println("Added: "+hm.put(100, new BankAccount(100,"Mr. Jaiswal",AcType.LOAN,LocalDate.parse("2021-10-03"),155000)));
		System.out.println("Added: "+hm.put(101, new BankAccount(101,"Mr. Devarkonda",AcType.CURRENT,LocalDate.parse("2022-11-03"),355000)));
		System.out.println("Added: "+hm.put(102, new BankAccount(102,"Mr. Ingle",AcType.SAVINGS,LocalDate.parse("2023-02-03"),455000)));
		return hm;
	}
	
	public static BankAccount findByAccountNo(int actNo,HashMap<Integer,BankAccount> bank) throws BankingException {
		BankAccount bkact= bank.get(actNo);
		if(bkact==null)
			throw new BankingException("Invalid Account Number!!!!");
		return bkact ;
	}

}
