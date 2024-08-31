package com.app.tester;

import static com.app.utils.ProductUtils.*;
import static com.app.utils.SerializeDeserializeUtils.storeProductDetails;
import java.util.Scanner;

public class TestSerialization {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter fileName(.ser) to store product details");
			storeProductDetails(populateMapfromList(populateData()), sc.nextLine());
			System.out.println("Product details stored.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
