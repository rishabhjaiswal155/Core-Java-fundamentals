package com.app.tester;
import java.util.Scanner;
import static com.app.utils.validateAllInputs.*;
//import static com.app.core.Vehicle.sdf;
//import com.app.core.Color;
import com.app.core.Vehicle;
import com.app.custom_exception.VehicleValidationException;
public class ShowroomApp {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter showroom capacity");
			Vehicle[] showroom=new Vehicle[sc.nextInt()];
			int counter=0;
			System.out.println("1.Add vehicle\n2.Display all vehicles in showroom\n3.purchase a Vehicle\n10.Exit\n");
			boolean flag=false;
			while(!flag) {
				System.out.println("Enter choice");
				switch(sc.nextInt()) {
				case 1:
					if(counter<showroom.length) { 
						System.out.println("Enter Vehicle details: chasisNo,Color,price,mnf_Date");
						Vehicle validatedVehicle=validateAll(sc.next(),sc.next(),sc.nextDouble(),sc.next(),showroom);
						showroom[counter++]=validatedVehicle;
						System.out.println("Vehicle is added into showroom");
					}else {
						System.out.println("Showroom Capacity is full!!!!");
					}
					break;
		
				case 2:
					if(counter>0 && counter<=showroom.length) {
						for(Vehicle v:showroom) {
							if(v!=null)
							   System.out.println(v);
						}
					}else {
                       System.out.println("No Vehicles to display in Showroom");						
					}
					break;
					
				case 3:
					System.out.println("Enter chasis number to purchase a vehicle");
					Vehicle testVehicle=findByChasisNo(sc.next(),showroom);
					System.out.println(testVehicle);
					if(testVehicle.getAddress()!=null)
						throw new VehicleValidationException("Vehicle chasis Number already sold");
					else
					{
						System.out.println("Enter Delivery Address:city,state,country,zipcode");
						testVehicle.linkDeliveryAddress(sc.next(), sc.next(),sc.next(),sc.next());
						System.out.println("Vehicle is ready to dispatch");
					}
					break;
					
				case 10:
					System.out.println("Exitting--->");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invaid choice");
					break;
				}
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
