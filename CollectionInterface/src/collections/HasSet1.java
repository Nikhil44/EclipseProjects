package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.*;


public class HasSet1 {

	static int number;
	public static void main(String[] args) {
		
		Random rd = new Random();
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10;i++) {
			
			number = rd.nextInt(10);
			list.add(number);
		}
		System.out.println("List : "+list);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println("Set :"+ set);
		
		
		

	}

}
