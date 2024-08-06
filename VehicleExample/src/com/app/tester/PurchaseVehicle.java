package com.app.tester;import java.util.Arrays;
import java.util.Scanner;
import static com.app.core.Vehicle.sdf;
import com.app.core.Color;
import com.app.core.Vehicle;
public class PurchaseVehicle {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Vehicle Details: chasisNo, color, price,mnf_date in dd/MM/yyyy format");
			System.out.println("Available Colors are: "+Arrays.toString(Color.values()));
            Vehicle v1=new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()),sc.nextDouble(),sdf.parse(sc.next()));		
            System.out.println(v1);
            System.out.println("Entry Delivery Address:city,state,country,zipcode");
            v1.linkDeliveryAddress(sc.next(),sc.next() ,sc.next(),sc.next());
            System.out.println(v1);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
