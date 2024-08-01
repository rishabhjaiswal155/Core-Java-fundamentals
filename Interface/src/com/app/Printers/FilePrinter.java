package com.app.Printers;

public class FilePrinter implements Printer {
	@Override
	public  void print(String msg) {
		System.out.println("Saving message:"+msg+" "+"on to File with speed:"+SPEED);
	}
	public void close() {
		System.out.println("File is closed");
	}

}
