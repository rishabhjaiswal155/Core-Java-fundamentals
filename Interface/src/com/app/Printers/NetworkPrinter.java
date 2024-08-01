package com.app.Printers;

public class NetworkPrinter implements Printer {
	@Override
	public  void print(String msg) {
		System.out.println("Sending message:"+msg+" "+"on to Network with speed:"+SPEED);
	}

}
