package flowControlStaements;


//while loop
public class WhileLoop {

	public static void main(String[] args) {

		DoWhileLoop dowhile=new DoWhileLoop();
		dowhile.doWhileMethod();
		int i=0;
		while(i<=10) {
		
			
			System.out.println(++i);
		}
	}

}

//do while loop

 class DoWhileLoop{
	public void doWhileMethod() {
		
		 int i=0;
		 do{
			 System.out.println("Inside do block:"+i);
			 i++;
		 }
		 while(i<=10);
		
			 
	}
	
}
