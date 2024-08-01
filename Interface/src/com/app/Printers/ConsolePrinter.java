package com.app.Printers;

public class ConsolePrinter implements Printer {
	@Override
	public  void print(String msg) {
		System.out.println("Printing message:"+msg+" "+"on to console with speed:"+SPEED);
	}

}
