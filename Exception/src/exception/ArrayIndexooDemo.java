package exception;

public class ArrayIndexooDemo {
	
	void method1() {
		System.out.println("Method 1 in ArrayIndexooDemo class");
	}


	public static void main(String[] args) {

		int arr[]= {10,20,30};
		
		System.out.println("The elements of array are : ");
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]);
	}

}
}
