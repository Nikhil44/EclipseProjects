package flowControlStaements;

import java.io.InputStream;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 InputStream st=System.in;
 Scanner sc = new Scanner(st);
 System.out.println("Please enter input : ");
 int n=sc.nextInt();
 
 int i,m=0,flag=0;      
 //it is the number to be checked    
 m=n/2;      
 if(n==0||n==1){  
  System.out.println(n+" is not prime number");      
 }else{  
  for(i=2;i<=m;i++){      
   if(n%i==0){      
    System.out.println(n+" is not prime number");      
    flag=1;      
    break;      
   }      
  }      
  if(flag==0)  { System.out.println(n+" is prime number"); }  
 }//end of else  
	}

}
