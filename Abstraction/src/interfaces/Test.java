package interfaces;

public class Test {

	public static void main(String[] args) {
		
		// We can not instantiate interfaces
		//Car car = new Car();
		
		//We can use interface as reference
		
		Car honda = new Honda();
		honda.go();
		honda.stop();
	}

}
