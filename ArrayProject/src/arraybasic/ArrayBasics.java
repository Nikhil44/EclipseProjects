package arraybasic;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
	
		
		int arr1[]= {5,10,15,25,20,30,4,5};
		int arr2[]= new int[10];
		arr2[0]=7;
		arr2[1]=11;
		arr2[2]=13;
		arr2[3]=17;
		arr2[4]=23;
		char ch[]= {'a','e','i','o','u'};
		System.out.println(Arrays.toString(ch));
		
		Arrays.parallelSort(arr1);
		Arrays.sort(arr1, 0, arr1.length);
		System.out.println("Splitarray : "+Arrays.spliterator(arr1));
		
		
		for (int i = 0; i < arr1.length; i++) {
		System.out.println("Elements of array : "+arr1[i]);
	}
		System.out.println("The value of array to string : "+Arrays.toString(arr2));
                 System.out.println("The value of array to string is  444");
		
		
	}

}
