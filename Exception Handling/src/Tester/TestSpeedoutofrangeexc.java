package Tester;
import java.util.Scanner;
import static utils.SpeedValidation.validateSpeed;
public class TestSpeedoutofrangeexc {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the current speed of vehicle");
			validateSpeed(sc.nextInt());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
