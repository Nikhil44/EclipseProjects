package basicJavaPractice;

public class SwithWithString {

	public static void main(String[] args) {
		String levelstring ="Expert";
		Integer level=0;
		switch(levelstring) {
		case "Begineer":level=1;
		break;
		case "Intermediate":level=2;
		break;
		case "Expert": level=3;
		break;
		default:level=0;
		break;
		
		}
		System.out.println("your level is:"+level);
		
	}

}
