package Tester;

import java.util.Scanner;

public class TestingwithTryWithResources {
	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);//here we have to close the resourse otherwise warning
	try(Scanner sc=new Scanner(System.in)){
			System.out.println(Integer.parseInt("abc1234"));
			System.out.println("try over....");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("in finally block");
		//	sc.close();
	}
        System.out.println("main method's over");
	}
}
