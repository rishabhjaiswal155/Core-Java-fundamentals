package com.app.core;

public enum Color {
	WHITE(1000),BLUE(2500),BLACK(4500),SILVER(3000),RED(5000);
private double additionalCost;
private Color(double additionalCost) {
	this.additionalCost=additionalCost;
}
public double getAdditionalCost() {
	return additionalCost;
}
public void setAdditionalCost(double additionalCost) {
	this.additionalCost = additionalCost;
}
@Override
public String toString() {
	return name().toLowerCase();
}

}

