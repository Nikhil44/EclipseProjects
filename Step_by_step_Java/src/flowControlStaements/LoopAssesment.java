package flowControlStaements;

import java.util.Scanner;

public class LoopAssesment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int inputNumber = sc.nextInt();
		
		
		for(int i=1; i<=inputNumber;i++) {
			
			if(i%10==0) {
				continue;
				
			}
			if(i>100) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
