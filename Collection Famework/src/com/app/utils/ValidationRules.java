package com.app.utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import static com.app.core.Vehicle.sdf;
import com.app.core.Color;
import com.app.core.Vehicle;
import com.app.customexception.VehicleValidationException;

public class ValidationRules {
	private static final double MAX_PRICE;
	private static final double MIN_PRICE;
	static {
		MAX_PRICE=1000000;
		MIN_PRICE=50000;
	}
	public static Vehicle ValidateAllInputs(String chasisNo,String color,double price,String mnf_Date,ArrayList<Vehicle> showroom) throws VehicleValidationException, ParseException {
		checkDup(chasisNo,showroom);
		Color clr=validateColor(color);
		double newPrice=validatePrice(price);
		newPrice+=clr.getAdditionalCost();
		Date date=validateDate(mnf_Date);
		return new Vehicle(chasisNo, clr, newPrice, date);
	}
	
	public static void checkDup(String chasisNo,ArrayList<Vehicle> showroom ) throws VehicleValidationException {
		Vehicle testVehicle=new Vehicle(chasisNo);
		if(showroom.contains(testVehicle))
			throw new VehicleValidationException("Duplicate chasisNumber");
		System.out.println("Valid chasis Number");
	}
	
	public static Color validateColor(String color) {
		return Color.valueOf(color.toUpperCase());
	}
	
	public static double validatePrice(double price) throws VehicleValidationException {
		if(price<MIN_PRICE || price>MAX_PRICE)
			throw new VehicleValidationException("price is not in Range!!!!");
		return price;
	}
	
	public static Date validateDate(String mnf_Date) throws ParseException, VehicleValidationException {
		Date d1=sdf.parse(mnf_Date);
		Date start=sdf.parse("01-04-2023");
		Date end=sdf.parse("31-03-2024");
		if(d1.before(end) || d1.after(start))
			return d1;
		else
		throw new VehicleValidationException("Manufacture Date is not in current financial Year");
	}
	
	public static Vehicle findByChasisNo(String chasisNo,ArrayList<Vehicle> showroom) throws VehicleValidationException {
		Vehicle findVehicle=new Vehicle(chasisNo);
		int index=showroom.indexOf(findVehicle);
		if(index==-1)
			throw new VehicleValidationException("chasis number"+chasisNo+" not found");
			return showroom.get(index);
	}
}
