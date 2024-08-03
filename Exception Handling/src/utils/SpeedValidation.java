package utils;

import custom_exceptions.SpeedOutOfRangeException;

public class SpeedValidation {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if(speed<MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow,causing traffic jam");
		if(speed>MAX_SPEED)
			throw new SpeedOutOfRangeException("You are diving too fast!!! FATAL!!!");
		System.out.println("Good Going!!! Happy Journey!!!");
	}
}
