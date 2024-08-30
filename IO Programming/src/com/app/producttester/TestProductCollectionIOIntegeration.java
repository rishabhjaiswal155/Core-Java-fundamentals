package com.app.producttester;

import java.util.Arrays;
import java.util.Scanner;
import com.app.category.Category;
import static com.app.utils.ProductUtils.*;
import static com.app.utils.IOUtils.storeProductDetailsinFile;

public class TestProductCollectionIOIntegeration {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter File name to store sorted product details");
			String fileName = sc.nextLine();
			System.out.println("Enter Category from:" + Arrays.toString(Category.values()));
			System.out.println("Choose from above Category");
			// get populatedMap
			storeProductDetailsinFile(filterAndSortedProduct(populateMapfromList(populateData()), sc.next()), fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
