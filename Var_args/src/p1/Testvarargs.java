package p1;

import java.util.Arrays;

public class Testvarargs {
	public static void main(String... args) {
	    Animal[] mypets= {new Cat("Mini"),new Dog("Tuffy"),new Horse("Chetak")};
		show();
		show(new Cat("Mini"));
		show(new Dog("Tuffy"));
		show(new Horse("Chetak"),new Dog("Tuffy"));
		for(Animal a:mypets) {
			show(a);
		}
	}
	
	public static void show(Animal ...animals) {
		System.out.println(Arrays.toString(animals));
	}

}
