package tester;

import static com.app.utils.ProductUtils.populateData;
import com.app.category.Category;
import java.util.List;
import java.util.Scanner;
import com.app.products.Product;

public class TestProduct1 {

	public static void main(String[] args) {
		// Display all product names of a particular category,exceeding specified price.
	try(Scanner sc=new Scanner(System.in)){
		List<Product> products=populateData();
	System.out.println("original list");
	products.forEach(System.out::println);
	System.out.println("Enter category and price");
	Category cat=Category.valueOf(sc.next().toUpperCase());
	double price=sc.nextDouble();
	System.out.println("Required list");
	products
	.stream()
	.filter(p->p.getCategory()==cat)
	.filter(p->p.getPrice()>price)
	.forEach(p->System.out.println(p.getName()));
}
}
}
