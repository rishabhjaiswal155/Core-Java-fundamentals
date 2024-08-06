package com.app.core;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	private Date mnf_Date;
	private DeliveryAddress address;
	
	public DeliveryAddress getAddress() {
		return address;
	}
	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}
	public Vehicle(String chasisNo, Color color, double price, Date mnf_Date) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.mnf_Date = mnf_Date;
	}
	public Vehicle(String chasisNo) {
		this.chasisNo=chasisNo;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder("Delivery Address");
		if(address==null)
			sb.append("Delivery Address not yet linked!!!!!");
		else
			sb.append(address);
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", mnf_Date=" + sdf.format(mnf_Date)
				+ "]"+"\n"+sb;
	}
	@Override
	public boolean equals(Object o) { 
		System.out.println("In vehicle equals");
		if(o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle)o).chasisNo);
		return false;
	}
	public void linkDeliveryAddress(String city,String state,String country,String zipcode) {
		this.address=new DeliveryAddress(city, state, country, zipcode);
	}
	public class DeliveryAddress{
		private String city;
		private String state;
		private String country;
		private String zipcode;
		public DeliveryAddress(String city, String state, String country, String zipcode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipcode = zipcode;
		}
		@Override
		public String toString() {
			return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipcode="
					+ zipcode + "]";
		}
	}
}
