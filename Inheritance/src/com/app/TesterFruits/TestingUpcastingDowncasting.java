package com.app.TesterFruits;

import com.app.Fruits.Alphonso;
import com.app.Fruits.Apple;
import com.app.Fruits.Fruit;
import com.app.Fruits.Mango;
import com.app.Fruits.Orange;

public class TestingUpcastingDowncasting {
	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.taste();
		
		Fruit f1=new Apple();//upcasting
		f1.taste();
		((Apple)f1).jam();//Downcasting
		
		Fruit f2=new Mango();//upcasting
		f2.taste();
		((Mango)f2).pulp();//Downcasting
		
		Fruit f3=new Alphonso();//upcasting
		f3.taste();
		((Alphonso)f3).juicypulp();//Downcasting
		
		Fruit f4=new Orange();
		f4.taste();
		if(f4 instanceof Orange)
			((Orange)f4).juice();
		else
			System.out.println("is not orange");
		

	}

}
