package com.app.core;

public enum Color {
	WHITE(1000),BLACK(3000),BLUE(2000),GREY(2500),RED(5000);
	private double additionalCost;
	private Color(double additionalCost) {
		this.additionalCost=additionalCost;
	}
	@Override
	public String toString() {
		return name().toLowerCase();
	}
	public double getAdditionalCost() {
		return additionalCost;
	}
	public void setAdditionalCost(double additionalCost) {
		this.additionalCost = additionalCost;
	}
	
}

