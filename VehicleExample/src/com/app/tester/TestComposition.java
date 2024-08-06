package com.app.tester;

import java.util.Scanner;
import static com.app.core.Vehicle.sdf;
import com.app.core.Color;
import com.app.core.Vehicle;

public class TestComposition {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Vehicle details: (chasisNo,color,price,mnf_Date) and Delivery details:(city,state,Country,zipcode)");
			Vehicle.DeliveryAddress address=new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()),sc.nextDouble(),sdf.parse(sc.next())).new DeliveryAddress(sc.next(), sc.next(), sc.next(),sc.next());
            System.out.println(address);
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
