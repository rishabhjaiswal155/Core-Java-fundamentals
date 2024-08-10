package com.app.tester;

import static com.app.utils.ValidationRules.ValidateAllInputs;
import static com.app.utils.ValidationRules.findByChasisNo;
import static com.app.utils.ValidationRules.validatePrice;
import static com.app.utils.CollectionUtils.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.core.Vehicle;
import com.app.custom_ordering.VehiclePriceComparator;
import com.app.customexception.VehicleValidationException;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Vehicle> showroom = populatedShowroom();
			System.out.println(
					"1.Add Vehicle to showroom\n2.Display all Vehicles in showroom\n"
					+ "3.Display specific Vehicle from showroom\n4.Update price of specific vehicle\n"
					+ "5.Delete vehicle details of a specific vehicle\n"
					+ "6.Apply discount to a vehicle by particulat color and having mnf_date before\n"
					+ "7.purchase a vehicle\n8.Display chasisNo and price of vehicle dispatched to a particular city\n"
					+ "10.sort Vehicles as per chasisNo in ascending order(Natural ordering)\n"
					+ "11.sort vehicles as per price in descending order(custom ordering)\n"
					+ "12.sort as per date and price in ascending order(custom ordering)\n"
					+ "13.exit");
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter choice:");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Vehicle Details: chasisNo,Color,price,Mnf_Date(dd-MM-yyyy)");
						Vehicle validatedVehicle = ValidateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								showroom);
						showroom.add(validatedVehicle);
						System.out.println("Vehicle added to showroom");
						break;

					case 2:
						for (Vehicle v : showroom)
							System.out.println(v);
						break;

					case 3:
						System.out.println("Enter chasis number to display the Vehicle details");
						Vehicle found = findByChasisNo(sc.next(), showroom);
						System.out.println(found);
						break;

					case 4:
						System.out.println("Enter chasis number and new price to update the price:");
						Vehicle findByChasisNo = findByChasisNo(sc.next(), showroom);
						findByChasisNo.setPrice(validatePrice(sc.nextDouble()));
						System.out.println("Price Updated!!");
						break;

					case 5:
						System.out.println("Enter chasis Number to delete the Vehicle details");
						Vehicle foundToDelete = findByChasisNo(sc.next(), showroom);
						showroom.remove(foundToDelete);
						System.out.println("Vehicle details are deleted!!!");
						break;

					case 6:
						System.out.println("Enter mnf_Date ,color and discount price to apply discount");
						applyDiscount(sc.next(), sc.next(), sc.nextDouble(), showroom);
						System.out.println("Vehicle price Updated");
						break;

					case 7:
						System.out.println("Enter chasis Number to purchase a vehicle");
						Vehicle foundVeh = findByChasisNo(sc.next(), showroom);
						if (foundVeh.getAddress() != null)
							throw new VehicleValidationException("Vehicle is sold");
						else {
							System.out.println("Enter city,state,Country,zipcode");
							foundVeh.linkDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
							System.out.println("Vehicle is ready to dispatched!!!");
						}
						break;

					case 8:
						System.out.println("Enter the name of city to find details");
						findVehicleByCity(sc.next(), showroom);
						break;
					
					case 10:
						Collections.sort(showroom);
						System.out.println("Sorted as per chasis number in ascending order!");
						break;
						
					case 11:
						Collections.sort(showroom,new VehiclePriceComparator());
						System.out.println("Sorted as per price in descending order!");
						break;

					case 13:
						System.out.println("Exitting Showroom Application---->");
						System.exit(0);
						break;

					default:
						System.out.println("Invalid choice");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
