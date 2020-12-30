package abstraction;

public class Test {

	public static void main(String[] args) {
		//We can not instantiate abstract class
		//BMW bmw = new BMW();
		
	//We can use abstract class as reference
		
    BMW threeSeries= new ThreeSeries(10);
    threeSeries.accelerate();
    threeSeries.commonFunction();
	
    
    BMW fiveSeries= new FiveSeries(20);
    fiveSeries.accelerate();
    fiveSeries.commonFunction();
	
	}

}
