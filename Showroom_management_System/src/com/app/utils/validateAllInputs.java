package com.app.utils;

import static com.app.core.Vehicle.sdf;

import java.text.ParseException;
import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;
import com.app.custom_exception.VehicleValidationException;
public class validateAllInputs {
	private static final double MAX_PRICE;
	 private static final double MIN_PRICE;
	 static {
		 MAX_PRICE=500000;
		 MIN_PRICE=50000;
	 }
	 
public static Vehicle validateAll(String chasisNo,String color,double price,String mnf_Date,Vehicle[] showroom) throws VehicleValidationException, ParseException {
    checkDuplication(chasisNo,showroom);
    Color clr=validateColor(color);
	double pri=validatePrice(price);
	pri+=clr.getAdditionalCost();
	Date date=validateDate(mnf_Date);
	return new Vehicle(chasisNo,clr,pri,date);
}

public static void checkDuplication(String chasisNo,Vehicle[] showroom) throws VehicleValidationException{
	Vehicle newVeh=new Vehicle(chasisNo);
	for(Vehicle v:showroom) {
		if(v!=null)
		if(v.equals(newVeh))
			throw new VehicleValidationException("Duplicate Chasis number");
	}
	System.out.println("Valid Chasis number");
}
public static Color validateColor(String color) {
	return Color.valueOf(color.toUpperCase());
}

public static double validatePrice(double price) throws VehicleValidationException {
	 if(price<MIN_PRICE || price>MAX_PRICE) 
		 throw new VehicleValidationException("Price is not in the range!!");
	 else
		 return price;
}

public static Date validateDate(String mnf_Date) throws ParseException, VehicleValidationException {
    Date d1=sdf.parse(mnf_Date);
    Date start=sdf.parse("1-04-2023");
    Date end=sdf.parse("31-03-2024");
    if(d1.before(start) || d1.after(end))
    	throw new VehicleValidationException("manufacture Date is not in current financial year");
    return d1;
}
}
