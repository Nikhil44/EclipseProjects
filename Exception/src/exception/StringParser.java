package exception;

import java.sql.Date;

public class StringParser {

	public static void main(String[] args) throws InterruptedException {
String s = "Nikhil";
Thread.sleep(1000);

try {
int a = Integer.parseInt(s);
System.out.println("The string s is : "+a);
} catch(NullPointerException e) {
	System.out.println("Please check string value");
}

catch(ArithmeticException e) {
	
}

finally {
	System.out.println("Inside finally block");
}

System.out.println("out of try catch block");


	}

}
