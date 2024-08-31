package com.app.tester;

import com.app.category.*;
import static java.time.LocalDate.*;
import java.util.Scanner;
import static com.app.utils.IOUtils.*;
import com.app.products.Product;
public class StoreProductDetails {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Product Details:id,name,category,manufactureDate,prce");
			System.out.println("Enter fileName");
			Product p1=new Product(sc.nextInt(), sc.next(), Category.valueOf(sc.next().toUpperCase()), parse(sc.next()), sc.nextDouble());
			System.out.println(sc.nextLine());
			storeproductDetails(p1, sc.nextLine());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
