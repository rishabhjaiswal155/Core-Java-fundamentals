package tester;

import static com.app.utils.ProductUtils.populateData;
import com.app.category.Category;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.app.products.Product;

public class TestProduct2 {

	public static void main(String[] args) {
		// prompt user for category and discount,apply that discount on all products of that specified category and display it
		try(Scanner sc=new Scanner(System.in)){
		List<Product> products=populateData();
	    System.out.println("original list");
	    products.forEach(System.out::println);
	    System.out.println("Enter category and discount");
	    Category cat=Category.valueOf(sc.next().toUpperCase());
	    double discount=sc.nextDouble();
	    System.out.println("Discounted products");
	    products
	    .stream()
	    .filter(p->p.getCategory()==cat)
	    .peek(p->p.setPrice(p.getPrice()-discount))
	    .forEach(System.out::println);
	    
	    //prompt user for category and discount,apply that discount on all products of that specified category and collect it into another list
	    List<Product> collectedList=products
	    .stream()
	    .filter(p->p.getCategory()==cat)
	    .peek(p->p.setPrice(p.getPrice()-discount))
	    .collect(Collectors.toList());
	    System.out.println("CollectedList");
	    collectedList.forEach(System.out::println);
		}
}
}
