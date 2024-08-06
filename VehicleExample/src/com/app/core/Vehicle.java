package com.app.core;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	private Date mnf_date;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	public Vehicle(String chasisNo, Color color, double price, Date mnf_date) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.mnf_date = mnf_date;
	}
	public Vehicle(String chasisNo) {
		this.chasisNo=chasisNo;
	}
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" +color + ", price=" + price + ", mnf_date=" + sdf.format(mnf_date)
				+ "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("In Vehical equals methods");
		if(o instanceof Vehicle) {
		Vehicle anotherVehicle=(Vehicle)o;
		return this.chasisNo.equals(anotherVehicle.chasisNo);
	}
		return false;
	}
}
