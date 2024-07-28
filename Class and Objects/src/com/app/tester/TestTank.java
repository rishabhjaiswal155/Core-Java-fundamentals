package com.app.tester;
import com.app.core.Tank;
public class TestTank {
	public static void main(String[] args) {
		Tank t1=new Tank(10);
		Tank t2=new Tank(20);
		System.out.println("Tank t1 level:"+t1.getLevel()+" "+" Tank t2 level:"+t2.getLevel());
        t1=t2;//t1 object is mapped for garbage collection
        System.out.println("Tank t1 level:"+t1.getLevel()+" "+" Tank t2 level:"+t2.getLevel());
        t1.setLevel(27);
        System.out.println("Tank t1 level:"+t1.getLevel()+" "+" Tank t2 level:"+t2.getLevel());
        t2.setLevel(t1.getLevel()+10);
        System.out.println("Tank t1 level:"+t1.getLevel()+" "+" Tank t2 level:"+t2.getLevel());
        
	}

}
