package com.app.core;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	private Date mnf_date;
	private DeliveryAddress address;
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
	
	public void linkDeliveryAddress(String city,String state,String country,String zipcode) {
		 this.address=new DeliveryAddress(city, state, country, zipcode);
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder("Delivery Address:");
		if(address==null)
			sb.append("Address Not yet linked");
		else
			sb.append(address);
		return "Vehicle [chasisNo=" + chasisNo + ", color=" +color + ", price=" + price + ", mnf_date=" + sdf.format(mnf_date)
				+ "]"+"\n" +sb;
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
	public class DeliveryAddress {
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
			return "[city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
		}
		}
}
