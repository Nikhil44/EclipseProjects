package collections;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random rd = new Random();
		int x = rd.nextInt();
		System.out.println("X : "+x);
		
		int y= rd.nextInt(100);
		System.out.println(y);

	}

}
