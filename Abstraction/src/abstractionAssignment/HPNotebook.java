package abstractionAssignment;

public class HPNotebook extends HP {
	public void click() {
		
		System.out.println("click method in HPNotebook");
	}
	public static void main(String[] args) {
		TouchScreenLaptop hpnotebook = new HPNotebook();
		hpnotebook.click();
		hpnotebook.scroll();
		
  
	 
 }
	}


