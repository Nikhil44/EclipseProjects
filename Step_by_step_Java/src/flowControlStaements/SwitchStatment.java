package flowControlStaements;

public class SwitchStatment {

	public static void main(String[] args) {
		int x = 20;
		switch(x) {
		case 10:System.out.println("The value of x is 10");
		break;
		case 20: System.out.println("The value of x is 20");
		break;
		case 30: System.out.println("The value of x is 30");
		break;
		default: System.out.println("The value of x is 40");
			
		}
		
		//Fall through 
		
		int y = 10;
		int z=20;
		switch(y) {
		case 10:
		case 20: System.out.println("Common for case 1 and case 2");
		break;
		case 30: System.out.println("The value of y is 30");
		break;
		default: System.out.println("The value of y is 40");
			
		}

	}

}
