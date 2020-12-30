package abstractionAssignment;

public class DELLNotebook extends DELL {

	final double PI=3.14;
	@Override
	public void click() {
System.out.println("click method in dellnotebook class");		
	}

	public static void main(String[] args) {

		TouchScreenLaptop dellnotebook = new DELLNotebook();
		dellnotebook.click();
		dellnotebook.scroll();

	}

}
