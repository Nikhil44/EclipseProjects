package collections;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		Set<String> tset = new TreeSet<>();
		
		tset.add("Niks");
		tset.add("Risk");
		tset.add("My");
		tset.add("Your");
		
		for (String obj : tset) {
			System.out.println(obj);
			
		}
	}

}
