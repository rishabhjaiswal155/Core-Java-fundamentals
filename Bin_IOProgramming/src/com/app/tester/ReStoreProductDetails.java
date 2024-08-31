package com.app.tester;


import java.util.Scanner;
import static com.app.utils.IOUtils.*;
public class ReStoreProductDetails {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter fileName");
			System.out.println(restoreProductDetails(sc.nextLine()));
			System.out.println("Restore Completed!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
