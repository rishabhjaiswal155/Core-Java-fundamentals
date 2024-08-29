package tester;

import static com.app.utils.ProductUtils.populateData;

import java.util.List;
import java.util.Scanner;
import com.app.category.Category;
import com.app.products.Product;

public class TestProduct3 {
	public static void main(String[] args) {
		// Display Sum of product prices of a specific category.
		try(Scanner sc=new Scanner(System.in)){
		List<Product> products=populateData();
System.out.println("Enter product category");
Category cat=Category.valueOf(sc.next().toUpperCase());
double i=products
.stream()
.filter(p->p.getCategory()==cat)
.peek(p->p.getPrice())
.mapToDouble(p->p.getPrice())
.sum();
System.out.print("Sum of prices of product="+i);
}
}
}