package exceptions;

public class CustomException extends Exception {
	 CustomException(String s) {
		super(s);
	}


	public static void main(String[] args) {
		String welcome = "Welcome!";
		try {
			validate(welcome);
		} catch (CustomException e){
			System.out.println("Custom Exception Caused");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validate(String welcome) throws CustomException {
		if(welcome.length() < 10){
		   throw (new CustomException("My Custome Exception"));
		}
	}

}
