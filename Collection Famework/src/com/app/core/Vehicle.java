package com.app.core;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	private Date mnf_Date;
	private DeliveryAddress address;
	
	public DeliveryAddress getAddress() {
		return address;
	}
	
	public void linkDeliveryAddress(String city,String state,String country,String zipcode) {
		this.address=new DeliveryAddress(city, state, country, zipcode);
	}
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
	
	public String getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getMnf_Date() {
		return mnf_Date;
	}
	public void setMnf_Date(Date mnf_Date) {
		this.mnf_Date = mnf_Date;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder("DeliveryAddress: ");
		if(address==null)
			sb.append("Not yet linked!!!");
		else
			sb.append(address);
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", mnf_Date=" + sdf.format(mnf_Date)+ "]"+" "+sb;
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
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "[city=" + city + ", state=" + state + ", country=" + country + ", zipcode="
					+ zipcode + "]";
		}
	}
}
