package jspiders;

public class InvalidchoiceException extends RuntimeException {
	
	private String message;

	public InvalidchoiceException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
