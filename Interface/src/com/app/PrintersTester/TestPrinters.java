package com.app.PrintersTester;

import com.app.Printers.ConsolePrinter;
import com.app.Printers.FilePrinter;
import com.app.Printers.NetworkPrinter;
import com.app.Printers.Printer;

public class TestPrinters {

	public static void main(String[] args) {
		ConsolePrinter p=new ConsolePrinter();//Direct Referencing
		p.print("Printing from console printer");
		
		Printer p1=new ConsolePrinter();//Indirect Referencing upcasting
		p.print("Printing from console printer");
		
		p1=new NetworkPrinter();
		p1.print("Printing from Network Printer");
		
		p1=new FilePrinter();
		p1.print("Printing from File Printer");
	}

}
