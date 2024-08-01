package com.app.shapeTester;

import com.app.shape.BoundedShape;
import com.app.shape.Circle;
import com.app.shape.Rectangle;

public class TestShapes{

	public static void main(String[] args) {
		//Dynamic initialization of Array
	BoundedShape[] shapes= {new Circle(10, 12, 6.3),new Rectangle(15, 12, 10, 5.2)};    
	for(BoundedShape bs:shapes)
         {    
        	 System.out.println(bs);
        	 System.out.println(bs.area());
         }
         
	}

}
