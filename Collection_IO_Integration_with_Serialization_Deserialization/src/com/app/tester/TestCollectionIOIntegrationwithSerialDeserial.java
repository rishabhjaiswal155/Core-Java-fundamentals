package com.app.tester;
import static com.app.utils.SerializeDeserializeUtils.restoreproductDetails;
import static com.app.utils.SerializeDeserializeUtils.storeProductDetails;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import com.app.custom_Exception.ProductHandlingException;
import com.app.products.Product;
public class TestCollectionIOIntegrationwithSerialDeserial {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter fileName");
			String fileName=sc.nextLine();
			Map<Integer, Product> products=restoreproductDetails(fileName);
			System.out.println("restored product details"+products);
			boolean exit=false;
			while(!exit) {
				System.out.println("Options:\n1.Update price of Product\n2.Display all Products\n"
						+ "3.Display all sorted products as per manufactureDate\n4.remove product\n"
						+ "5.Exit and store the product details in .ser file\n");
				System.out.println("Enter choice");
				try {
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter Product id and price to update");
						Product product=products.get(sc.nextInt());
						if(product==null)
							throw new ProductHandlingException("Invalid ProductId!!!!!");
						product.setPrice(product.getPrice()+ sc.nextDouble());
						System.out.println("Price Updated!!!!");
						break;
						
					case 2:
						System.out.println("Displaying all Product details:");
						products.forEach((k,v) -> System.out.println(v));
						break;
						
					case 3:
						System.out.println("Sorted Product details as per manufactureDate:");
						products.values()
						.stream()
						.sorted(Comparator.comparing(Product::getManufactureDate))
						.forEach(System.out::println);
						break;
						
					case 4:
						System.out.println("Enter productId to remove the Product");
						Product removedProduct=products.remove(sc.nextInt());
						if(removedProduct==null)
							throw new ProductHandlingException("Product not found:Invalid productId!!!");
						System.out.println("Product Removed:"+removedProduct);
						break;
						
					case 5:
						exit=true;
						storeProductDetails(products,fileName);
						System.out.println("Product details stored in "+fileName);
						System.out.println("Exitting the Application......");
						break;
						
					default:
						System.out.println("Invalid choice!!!!");
							break;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
