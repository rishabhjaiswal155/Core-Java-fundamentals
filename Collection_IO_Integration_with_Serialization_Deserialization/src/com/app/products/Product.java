package com.app.products;

import java.io.Serializable;
import java.time.LocalDate;

import com.app.category.Category;

public class Product implements Serializable {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 4080976658196480610L;
	/**
	 * 
	 */
	private static final long serialVersionUID = 6364372261526304598L;
	private int id;
	private String name;
	private Category category;
	private transient LocalDate manufactureDate;
	private double price;
	public Product(int id, String name, Category category, LocalDate manufactureDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.manufactureDate = manufactureDate;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", manufactureDate="
				+ manufactureDate + ", price=" + price + "]";
	}
	

}
