package com.app.core;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	private Date mnf_Date;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public Vehicle(String chasisNo, Color color, double price, Date mnf_Date) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.mnf_Date = mnf_Date;
	}
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", mnf_Date=" + sdf.format(mnf_Date)
				+ "]";
	}
	@Override
	public boolean equals(Object o) {
    System.out.println("In Vehical equals");
	Vehicle newVehicle=new Vehicle(chasisNo);
	if(o instanceof Vehicle) {
		newVehicle=(Vehicle)o;
		return this.chasisNo.equals(newVehicle.chasisNo);
	}
	return false;
	}

}
