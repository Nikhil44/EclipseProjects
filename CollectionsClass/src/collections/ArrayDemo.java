package collections;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[]= {10,30,40,50,20  };
		
		for (int i : a) {
			System.out.println(i);
			
		}
		Arrays.sort(a);
		
		for (int j : a) {
			System.out.println(j);
			
		}
	}

}
