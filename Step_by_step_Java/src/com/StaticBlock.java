package com;

public class StaticBlock {
	
	// From java 7 we need to main method in class to execute static block
	public static void main(String[] args) {
		System.out.println("This is main method and this will execute after static block");
		/*
		 * static{ System.out.println("Static block inside main method"); }
		 */
		// Static block can not be present inside the main method
	}

	static {
		
		System.out.println("This is static block and it can be executed without main method and before main method");
		System.out.println("Static block 1");
		
		//Static block can have a non static block(Instance block) inside of it.
		{
			System.out.println("This is non static block ");
		}
	}
	
	 static {
		 System.out.println("Static block 2");
		 
		 // Inside a static block should not have a static block i.e. Nested static block is not possible
			/*
			 * static { System.out.println("Hello This is a nested static block block"); }
			 */
	 }
	
}
