package customeexception;

public class UncheckedCustomException extends RuntimeException{

	public static void main(String[] args) {
		
	
	try {
		throw new Exception("Fund not available");
	}
	catch(Exception e)
	 {
		
	}

}}
