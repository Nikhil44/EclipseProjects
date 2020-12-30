package operators;

public class TernaryOperator {

	public static void main(String[] args) {

		// (TestExpression) ? value1:value2
		int x=10, y=20;
		
		String result = (x>y)? "The value of x is greater":"The value of y is greater";
		System.out.println(result);   
		boolean result1 = (x<y)? true:false;
		System.out.println(result1);
		
	}

}
