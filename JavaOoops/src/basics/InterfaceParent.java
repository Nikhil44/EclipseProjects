package basics;

 public interface InterfaceParent {

	public static void main(String[] args) {
		System.out.println("Creating main method in interface");
		InterfaceParent.method1();
		InterfaceParent.method2();
		InterfaceParent.method3();
		

	}

	public  static void method1() {

		System.out.println("This is static method in interface");

	}
	 static void method2() {
		
	}

	private static  void method3() {

		System.out.println("This is private static method in interface");
	}

	 void method4(); 
	 
	 abstract void method5();
}
 
