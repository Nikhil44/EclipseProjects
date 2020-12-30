package interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside go method");

	}

	@Override
	public void stop() {
		System.out.println("Inside stop method");
	}

}
