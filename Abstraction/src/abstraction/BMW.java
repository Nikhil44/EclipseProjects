package abstraction;

//abstract class can have public and default access modifiers
//Abstract class can not be final
abstract class BMW {
	
	int a=20;
	int b;
	void commonFunction() {
		System.out.println("Inside CommonFunction method");
	}
	//Abstract class can have constructor
	BMW(int b){
		this.b=b;
	}

	// abstract method can only have default, public and protected access modifiers
	// abstract method can not have final or static
	abstract void accelerate();
	
	abstract void brake();
	
	public static void method1(){
		System.out.println("Non abstract static method in abstract class");
	}
	
	//Abstract class can have private method but can not be accsed 
	private static void method2() {
		System.out.println("Private method in abstract calss");
	}
	
	protected static void method3() {
		System.out.println("Protectd method in abstract class");
		
	}
// abstract class can have main method
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
	
}
