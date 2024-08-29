package tester;

import static com.app.utils.ProductUtils.populateData;

import java.util.List;
import java.util.Scanner;
import com.app.category.Category;
import com.app.products.Product;

public class TestProduct4 {
	public static void main(String[] args) {
		// Display Average of product prices of a specific category.
		try(Scanner sc=new Scanner(System.in)){
		List<Product> products=populateData();
System.out.println("Enter product category");
Category cat=Category.valueOf(sc.next().toUpperCase());
System.out.print("Average of prices of product="); 
products
.stream()
.filter(p->p.getCategory()==cat)
.peek(p->p.getPrice())
.mapToDouble(p->p.getPrice())
.average()
.ifPresent(System.out::println);
}
}
}