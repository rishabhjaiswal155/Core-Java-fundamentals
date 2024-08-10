package com.app.tester;
import static com.app.utils.CollectionUtils.populatedShowroom;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Vehicle;
public class TestIterator {

	public static void main(String[] args) {
		try {
			ArrayList<Vehicle> showroom=populatedShowroom();
			Iterator<Vehicle> itr=showroom.iterator();
			System.out.println("Vehicles via iterator()");
			//itr.remove();//IllegalStateException as itr.remove() can be used only after itr.next()
			while(itr.hasNext()) {
				System.out.println(itr.next());
				itr.remove();
			}
			//itr.remove();//removes last element in list,if itr.remove() is not in while loop
			System.out.println(showroom);//prints [] after itr.remove() in while loop;
			//itr.next();//NoSuchElementException as list is empty after itr.remove() in while loop
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
