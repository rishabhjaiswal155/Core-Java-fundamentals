package com.app.tester;
import java.util.Scanner;
import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class EventOrganiserApp {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the capacity of Event");
	Person[] participants=new Person[sc.nextInt()];
	int counter=0;
	boolean exit=false;
	while(!exit) {
		System.out.println("1.Register Student\n2.Register Faculty\n3.Display all Participants\n4.Display particular Participant\n5.Display specific Functionality\n7.Exit\n");
		System.out.println("Choose option:");
		switch(sc.nextInt()) {
		case 1:
			if(counter<participants.length) {
				System.out.println("Enter Students Details: fn,ln,YOP,course,fees,marks");
			    participants[counter++]=new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble());
				System.out.println("Student details Registered!");
			}else {
				System.out.println("Event Capacity Full!!!!!");
			}
			break;
			
		case 2:
			if(counter<participants.length) {
				System.out.println("Enter Faculty Details: fn,ln,experience,expertise");
				participants[counter++]=new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
				System.out.println("Faculty details Registered!");
			}else {
				System.out.println("Event Capacity Full!!!!!");
			}
			break;
			
		case 3:
			if(counter>0) {
				for(Person p:participants) {
					if(p!=null) {
						System.out.println(p);
				}
			}
			}else {
				System.out.println("No Participants Registered to display!!");
			}
				break;
				
		case 4:
			System.out.println("Enter Seat number to display Participant:");
			int index=sc.nextInt()-1;
			if(index>=0 && index<counter) {
				System.out.println(participants[index]);
			}
			else {
				System.out.println("Invalid seat number");
			}
			break;
			
		case 5:
			System.out.println("Enter Seat number to display Participant specific functionality:");
			int index1=sc.nextInt()-1;
			if(index1>=0 && index1<counter) {
				if(participants[index1] instanceof Student)
				((Student)participants[index1]).study();
				else
					((Faculty)participants[index1]).teach();
			
			}else {
				System.out.println("Invalid Seat number!!");
			}
			break;
		
		case 7:	
			exit=true;
			System.out.println("Exitting----->");
			break;
			
			default:
				System.out.println("Please enter valid choice");
				break;
		}
	}

	}

}
