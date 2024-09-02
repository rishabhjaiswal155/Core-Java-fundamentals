package com.app.tester;

import java.util.Scanner;
import static com.app.utils.SerializeDeserializeUtils.restoreproductDetails;
public class TestDeserializationwithoutJar {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter fileName");
			System.out.println(restoreproductDetails(sc.nextLine()));
			System.out.println("products details restored....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
