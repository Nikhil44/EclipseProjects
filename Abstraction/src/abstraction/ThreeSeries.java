package abstraction;

 
//Child class implementing abstract class can have default, public and final access modifiers
public class ThreeSeries  extends BMW{

	
	// abstract method can only have default, public and protected access modifiers in child class as well
	// abstract method can not have final or static in child class also
	
	ThreeSeries(int b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	 void accelerate() {
		System.out.println("Inside the ThreeSeries Accelerator method ");
	}

	@Override
	void brake() {
		// TODO Auto-generated method stub
		
	}

}
