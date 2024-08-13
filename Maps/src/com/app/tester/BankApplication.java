package com.app.tester;

import static com.app.utils.BankAccountUtils.findByAccountNo;
import static com.app.utils.BankAccountUtils.populateBankAccount;
import static java.time.LocalDate.parse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.AcType;
import com.app.core.BankAccount;
import com.app.custom_exception.BankingException;

public class BankApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<Integer, BankAccount> accts = populateBankAccount();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options:1.Create a account\n2.Display all accounts\n3.Display account summary for specific accountno\n"
								+ "4.Transfer Funds\n5.close Account\n6.display account details "
								+ "by AcType\n7.display account details by balance\n8."
								+ "Remove all loan Accounts\n9..exit");
				System.out.println("Enter choice");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Account number to create Account");
						int accno = sc.nextInt();
						if (accts.containsKey(accno))
							throw new BankingException("Account creation failed,Duplicate Account No!!!!");
						System.out.println(
								"Enter BankAccount details:customerName,type,creationDate[yr-mon-day],balance");
						accts.putIfAbsent(accno, new BankAccount(accno, sc.next(), AcType.valueOf(sc.next().toUpperCase()), parse(sc.next()),
								sc.nextDouble()));
						System.out.println("Account Created Successfully!");
						break;

					case 2:
						for (BankAccount a : accts.values())
							System.out.println(a);
						break;

					case 3:
						System.out.println("Enter account number to display summary");
						BankAccount bkact = findByAccountNo(sc.nextInt(), accts);
						System.out.println(bkact);
						break;

					case 4:
						System.out
								.println("Enter source AccountNumber,destination AccountNumber and Amount to transfer");
						int srcActNo = sc.nextInt();
						int destActNo = sc.nextInt();
						BankAccount src = findByAccountNo(srcActNo, accts);
						BankAccount dest = findByAccountNo(destActNo, accts);
						src.fundsTransfer(dest, sc.nextDouble());
						System.out.println("Funds Transferred Suceessfully!!");
						break;

					case 5:
						System.out.println("Enter Account number to close account");
						BankAccount closedAct=accts.remove(sc.nextInt());
						if (closedAct == null)
							throw new BankingException("Closing Account failed,Invalid AccountNo!");
						System.out.println("BankAccount with details" + closedAct + " " + " closed!");
						break;

					case 6:
						System.out.println("Enter AcType to display Account details");
						AcType type = AcType.valueOf(sc.next().toUpperCase());
						for (BankAccount ba : accts.values())
							if (ba.getType() == type)
								System.out.println(ba);
						break;

					case 7:
						System.out.println("Enter balance to display account details");
						double bal=sc.nextDouble();
						for (BankAccount b : accts.values())
							if (b.getBalance() == bal)
								System.out.println(b);
						break;

					case 8:
						Iterator<BankAccount> itr=accts.values().iterator();
						System.out.println("Removing all Accounts of AcType LOAN");
						while(itr.hasNext()) {
							if(itr.next().getType()==AcType.LOAN)
								itr.remove();
						}
						break;

					case 9:
						exit = true;
						System.out.println("Exitting BankApplication");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
