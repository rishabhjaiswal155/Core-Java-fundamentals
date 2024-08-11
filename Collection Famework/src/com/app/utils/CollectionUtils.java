package com.app.utils;

import static com.app.utils.ValidationRules.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

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
		showroom.add(new Vehicle("pc-108",Color.GREY,validatePrice(557000),validateDate("24-07-2023")));
		showroom.add(new Vehicle("pc-109",Color.RED,validatePrice(55800),validateDate("31-07-2023")));
		showroom.add(new Vehicle("pc-111",Color.WHITE,validatePrice(595000),validateDate("26-10-2023")));
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
	public static void findVehicleByCity(String city,ArrayList<Vehicle> showroom){	
		for(Vehicle v:showroom) {
			if(v.getAddress()!=null && v.getAddress().getCity().equals(city)) {
				System.out.println("Vehicle chasis Number: "+v.getChasisNo()+" "+"Vehicle's price: "+v.getPrice());
			}
			}

}
	public static void removeVehicleByColor(String color,ArrayList<Vehicle> showroom) throws VehicleValidationException{
		Color clr=validateColor(color);
		Iterator<Vehicle> listItr=showroom.iterator();
		while(listItr.hasNext()) {
			if(listItr.next().getColor()==clr)
				listItr.remove();
			}
		System.out.println("Vehicle details removed");
}
}