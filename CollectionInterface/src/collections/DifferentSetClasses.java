package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSetClasses {

	public static void main(String[] args) {

		Random rd = new Random();
		
		//HasSet does not maintain order but arrange it by increasing order
		HashSet<Integer> hset = new HashSet<>();
		
		
		
		//LinkedHashSet maintain order
		LinkedHashSet<Integer> lset= new LinkedHashSet<>();
		
		//Order in ascending  order
		TreeSet<Integer> tset = new TreeSet<>();
		
		for (int i = 0; i <=5; i++) {
			int number = rd.nextInt(10);
			lset.add(number);
			tset.add(number);
			hset.add(number);
			System.out.println(number);
			
		}
		System.out.println("HashSet elements :"+lset);
		System.out.println("HashSet elements :"+hset);
		System.out.println("HashSet elements :"+tset);
	}

}
