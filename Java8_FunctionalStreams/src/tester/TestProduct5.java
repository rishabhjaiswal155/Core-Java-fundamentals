package tester;
import static com.app.utils.ProductUtils.populateData;
import java.util.List;
import java.util.Scanner;
import com.app.category.Category;
import com.app.products.Product;
public class TestProduct5 {
	public static void main(String[] args) {
		//Sort products of specified category as per price and display their names. 
		try(Scanner sc=new Scanner(System.in)){
		List<Product> products=populateData();
		System.out.println("Original list:");
		products.forEach(System.out::println);
System.out.println("Enter product category");
Category cat=Category.valueOf(sc.next().toUpperCase());
System.out.println("Sorted list of products of specified category as per price:");
products
.stream()
.filter(p->p.getCategory()==cat)
.peek(p->p.getPrice())
.sorted((p1,p2)->((Double)p1.getPrice()).compareTo(p2.getPrice()))
.forEach(p->System.out.println(p.getName()));
}
}
}
