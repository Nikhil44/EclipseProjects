package exception;

public class Test {

	//null pointer exception
	static String st;
	//static ArrayIndexooDemo a;
	  
	
	
	public static void main(String[] args) {
		//System.out.println("Test method");
		
		//Test.a.method1();
		for (int i = 0; i <st.length(); i++) {
			System.out.println(st.charAt(i));
			
			Test test = new Test();
			
			
			// null pointer exception
			
//			if(st.equals("Nis4")) {
//				System.out.println("Its same");
//				
//			}
			
			/*
			 * //Avoid null pointer exception
			 * 
			 * if("Niks".equals(null)) {
			 * 
			 * System.out.println("are same"); }
			 */
		}
		System.out.println(st);

	}

}
