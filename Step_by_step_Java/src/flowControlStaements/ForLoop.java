package flowControlStaements;

public class ForLoop {

	public static void main(String[] args) {
		
		
		 for(int i=1;i<20;i++) {
			
			 System.out.println("The value of i is : "+ i);
			
		 }	
		
 int i=1;
 for(;;) {
	
	 System.out.println("The value of i is : "+ i);

	 i++;
	 if(i>20) {
		 break;
	 }
 }
	}

}
