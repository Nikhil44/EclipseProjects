package interfaces;

public interface Car {
	
	//variable initialization is required
	
	int a=20;
	
	//By default variables are public static and final
	public static final int b = 10;
	//Interface methods are public and abstract by default.
	void go();
	void stop();
	
	/*
	 * Car(){
	 * 
	 * }
	 */
	
	//We can add static methods in interface
	public static void method1() {
		System.out.println("This is static method from car interface");
		
	}
	
	// We can use private but method can not be accessed
	private static void method2() {
		System.out.println("This is private static method in car interface");
		
	}
	
	//Interface can not have protected access modifier
	
	/*
	 * protected static void method3() {
	 * System.out.println("Inside protected method"); }
	 */
	// We can have main method as well
	public static void main(String[] args) {
		// We can not instantiate a interface
		//Car car = new Car();
		
		System.out.println("Inside main static method");
		
	}

}
