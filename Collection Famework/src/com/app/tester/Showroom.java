package com.app.tester;

import java.util.ArrayList;
import java.util.Scanner;
import static com.app.utils.ValidationRules.*;
import com.app.core.Vehicle;
import com.app.customexception.VehicleValidationException;

public class Showroom {

	public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
    	ArrayList<Vehicle> showroom=new ArrayList<>();
    	System.out.println("1.Add Vehicle to showroom\n2.Display all Vehicles in showroom\n3.Display specific Vehicle from showroom\n4.purchase a vehicle\n10.exit");
        boolean exit=false;
        while(!exit) {
        	System.out.println("Enter choice:");
        	switch(sc.nextInt()) {
        	case 1:
        		System.out.println("Enter Vehicle Details: chasisNo,Color,price,Mnf_Date(dd-MM-yyyy)");
        		Vehicle validatedVehicle = ValidateAllInputs(sc.next(), sc.next(),sc.nextDouble(), sc.next(), showroom);
        		showroom.add(validatedVehicle);
        		System.out.println("Vehicle added to showroom");
        		break;
        		
        	case 2:
        		for(Vehicle v:showroom)
        		System.out.println(v);
                break;
        		
        	case 3:
        		System.out.println("Enter chasis number to display the Vehicle details");
        		Vehicle found=findByChasisNo(sc.next(), showroom);
        		if(showroom.contains(found))
        		System.out.println(found);
        		else
        			throw new VehicleValidationException("chasisNumber not found");
                break;   	
                
        	case 10:
        		System.out.println("Exitting Showroom Application---->");
        		System.exit(0);
        		break;
        	
        		default:
        			System.out.println("Invalid choice");
        			break;
        	}
        }
    }catch(Exception e) {
    	e.printStackTrace();
    }

	}

}
