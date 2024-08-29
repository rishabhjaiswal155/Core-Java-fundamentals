package tester;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		// Display sum of all even numbers and average of all odd numbers between 1-100
		System.out.println("Sum of all even numbers from 1-100");
		IntStream
		.rangeClosed(1, 100)
		.filter(i->i%2==0)
		.sum();
		
		System.out.println("Average of all odd numbers from 1-100");
		OptionalDouble optional=IntStream
		.rangeClosed(1, 100)
		.filter(i->i%2!=0)
		.average();
		if(optional.isPresent())
			System.out.println("Average="+optional.getAsDouble());
		else
		System.out.println("Empty stream/No odd numbers to avergare");
		
		//OR
		System.out.println("Trying to pint average");
	             IntStream
	    		.of(10,20,30,40,50,60,70,71)
	    		.filter(i->i%2!=0)
				.average()
				.ifPresent(a->System.out.println(a));

	             //print average of odd numbers  between 10 and 50,if stream is empty  print -100 or else print average.	

	             System.out.println("Average of odd numbers between 10-50");
	             OptionalDouble d=IntStream
	             .range(11, 50)
	             .filter(i->i%2!=0)
	             .average();
	             if(d.isEmpty())
	            	System.out.println(-100); 
	             else
	               System.out.println("Average="+d.getAsDouble()); 	 
	             }
}