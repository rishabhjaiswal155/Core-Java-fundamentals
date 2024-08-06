package com.app.tester;

import java.util.Scanner;
import static com.app.core.Vehicle.sdf;
import com.app.core.Color;
import com.app.core.Vehicle;

public class TestEqualsMethod {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Vehicle1 details:chasisNo,Color,price,mnf_Date");
			Vehicle v1=new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()),sc.nextDouble(),sdf.parse(sc.next()));
			System.out.println(v1);
			
			System.out.println("Enter Vehicle2 details:chasisNo,Color,price,mnf_Date");
			Vehicle v2=new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()),sc.nextDouble(),sdf.parse(sc.next()));
			System.out.println(v2);
			
			System.out.println(v1.equals(v2));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
