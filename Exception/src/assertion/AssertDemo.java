package assertion;

public class AssertDemo {

	public static void main(String[] args) {
		int balance = 100;
		int withdrawl = 120;
		assert (withdrawl  <= balance):"Withdrawl is greater than balance";
	}

}
