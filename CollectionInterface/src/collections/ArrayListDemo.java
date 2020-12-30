package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		List<Integer> list1 = new ArrayList<>();
		for (int i = 10; i <=100; i=i+10) {
			list1.add(i);
			
			
		}

		// java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
		//System.out.println("The Value of s : "+ list.get(3));
		
		System.out.println("List : "+list1);
		list1.add(4, 110);
		
		System.out.println("After Insert : "+list1);
		
		list1.set(4, 111);
		System.out.println("After value set(Replacement) : "+list1);
		list1.addAll(0, list);
		
		System.out.println("After adding list by using addALL : "+list1);
		
		if(list1.contains(111)) {
			
			System.out.println("List has value");
		
		}
		else {
			
			System.out.println("List do not have value");
		  
		}
		System.out.println("The elements in list are : ");
		
		for(int i=0; i<list1.size();i++) {
			System.out.print(list1.get(i));
			
		}
		
		list1.remove(0);
		System.out.println("\n"+list1);
		
		LinkedList<Integer> list123= new LinkedList<>();
		
	Iterator<Integer> itr = list123.iterator();
	
	//java.util.NoSuchElementException when we try to get an element which is not present using itr.next() method
	//System.out.println("The next values is :"+itr.next());
	
		
		ListIterator<Integer> it = list.listIterator();
		
		
		while(it.hasNext()) {
		
			System.out.println("The values of list: "+it.next());
			it.remove();
			System.out.println("The values of list: "+it.next());

			
		}
		


		

	}


}
