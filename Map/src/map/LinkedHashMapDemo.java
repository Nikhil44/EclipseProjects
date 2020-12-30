package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hashmap = new LinkedHashMap<>();
		
		hashmap.put("Nikhil", 50);
		hashmap.put("Deepak", 60);

		hashmap.put("Rahul", 70);

		hashmap.put("Nikita", 80);

		hashmap.put("Kamal", 90);
		hashmap.put("Taishqa", 100);
		
		Set<String> keyset= hashmap.keySet();
		System.out.println("keySets : "+keyset);
		
		Collection<Integer> values=hashmap.values();
		System.out.println("Values: "+values);
		
		for (String key : keyset) {
			System.out.println("Key : "+ key+" value : "+ hashmap.get(key));
			
		}

		
	}

}
