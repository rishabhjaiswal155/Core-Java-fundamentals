package custom_exceptions;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String msg) {
		super(msg);
	}
}
