package com.app.core;
public enum Color {
	WHITE(1000),BLACK(3000),RED(6000),GREY(2500),BLUE(1500);
private double additionalCost;
private Color(double additionalCost) {
	this.additionalCost = additionalCost;
}
public double getAdditionalCost() {
	return additionalCost;
}
@Override
public String toString() {
	return name().toUpperCase();
}
}
