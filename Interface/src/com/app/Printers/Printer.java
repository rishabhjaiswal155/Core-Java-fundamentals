package com.app.Printers;

public interface Printer {
	//javac implicitly add public static final to data member
	int SPEED=120;
	//javac implicitly add public abstract to method declaration
	void print(String msg);

}
