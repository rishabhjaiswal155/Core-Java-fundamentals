package com.app.tester;
import java.util.Scanner;
import static com.app.core.Vehicle.sdf;
import com.app.core.Vehicle;
public class TestVehicle {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Vehicle Details: chasisNo, color, price,mnf_date in dd/MM/yyyy format");
            Vehicle v1=new Vehicle(sc.next(),sc.next(),sc.nextDouble(),sdf.parse(sc.next()));		
            System.out.println(v1);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
