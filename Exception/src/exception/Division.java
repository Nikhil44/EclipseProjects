package exception;

import java.util.Scanner;

public class Division {
	
	
	 public static void main(String[] args) {
		 int a, b,c,d;
		System.out.println("Please enter numbers: ");
		
		try {
			
	
		Scanner sc = new Scanner(System.in);
		 a=Integer.parseInt(sc.next());
		 b=Integer.parseInt(sc.next());
		
		 c = a/b;
		  System.out.println("Result : "+c);
		} catch(ArithmeticException e) {
			System.out.println("Please do not enter 0 value for b");
		}
		  System.out.println("More code goes here : ");
		
	}

}
