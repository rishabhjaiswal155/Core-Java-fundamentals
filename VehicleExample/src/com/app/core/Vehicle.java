package com.app.core;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Vehicle {
	private String chasisNo;
	private String color;
	private double price;
	private Date mnf_date;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	public Vehicle(String chasisNo, String color, double price, Date mnf_date) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.mnf_date = mnf_date;
	}
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", mnf_date=" + sdf.format(mnf_date)
				+ "]";
	}
}
