package Cours1;

public class ValeurNonInitialiseeException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public ValeurNonInitialiseeException(){};
	
	public ValeurNonInitialiseeException(String message) {
		super(message);
	}
	
	public ValeurNonInitialiseeException(Throwable cause) {
		super(cause);
	}
	
	public ValeurNonInitialiseeException(String message, Throwable cause) {
		super(message,cause);
	}

}
