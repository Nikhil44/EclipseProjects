package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Nikhil");
		list.add("Akhil");
		list.add("Bakhil");
		list.add("Shakhil");
		list.add("Shakhil");

		
		System.out.println("Before Sorting : "+list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting : "+list);
		
		Collections.max(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		//Collections.reverse(list);
		System.out.println(list);
		System.out.println("Size of list "+list.size());
		System.out.println("Second Highest Number: "+list.get(list.size()-1));
		
	
		
		




	}

}
