package basics;

public class InterfaceChild implements InterfaceParent {

	public static void main(String[] args) {
		InterfaceParent interfacechildobject = new InterfaceChild();
		interfacechildobject.method4();   
	

	}

	@Override
	public void method4() {
		System.out.println("This is abstract method in interface");
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub

	}

}
