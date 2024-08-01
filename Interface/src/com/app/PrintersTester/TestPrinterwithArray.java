package com.app.PrintersTester;

import com.app.Printers.ConsolePrinter;
import com.app.Printers.FilePrinter;
import com.app.Printers.NetworkPrinter;
import com.app.Printers.Printer;

public class TestPrinterwithArray {

	public static void main(String[] args) {
		Printer[] printers= {new ConsolePrinter(),new NetworkPrinter(),new FilePrinter()};
         for(Printer p:printers)
        	 p.print("This is Interface");
	}
}
