package com.app.utils;

import static com.app.utils.ValidationRules.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;
import com.app.customexception.VehicleValidationException;

public class CollectionUtils {
	public static ArrayList<Vehicle> populatedShowroom() throws VehicleValidationException, ParseException {
		ArrayList<Vehicle> showroom=new ArrayList<>();
		showroom.add(new Vehicle("pc-100",Color.BLACK,validatePrice(55000),validateDate("25-05-2023")));
		showroom.add(new Vehicle("pc-110",Color.BLUE,validatePrice(58000),validateDate("25-06-2023")));
		showroom.add(new Vehicle("pc-106",Color.GREY,validatePrice(555000),validateDate("24-07-2023")));
		showroom.add(new Vehicle("pc-104",Color.RED,validatePrice(55000),validateDate("31-07-2023")));
		showroom.add(new Vehicle("pc-112",Color.WHITE,validatePrice(585000),validateDate("26-10-2023")));
		return showroom;
	}
	
	public static void applyDiscount(String mnf_Date,String color,double discountPrice,ArrayList<Vehicle> showroom) throws ParseException, VehicleValidationException{
		Date d1=validateDate(mnf_Date);
		Color clr=validateColor(color);
		for(Vehicle v:showroom) {
		if(v.getMnf_Date().before(d1) && v.getColor().equals(clr)) {
			v.setPrice(v.getPrice()-discountPrice);
		}
	}
	}
	
//	public static void findVehicleByCity(String city,ArrayList<Vehicle> showroom) throws VehicleValidationException{
//		
//		for(Vehicle v:showroom) {
//			Vehicle.DeliveryAddress delAdd=new Vehicle(v.getChasisNo()).new DeliveryAddress(city);
//			if(v.getAddress()==null)
//				throw new VehicleValidationException("Vehicle not yet sold!!!");
//			else {
//			        if(v.getAddress().getCity().equals(delAdd))
//				        System.out.println(v.getChasisNo()+" "+v.getPrice());
//				}		
//	}
//}
}