package com;



public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1="Madam";
System.out.println(st1);
String st2="";
 char [] a= st1.toCharArray();
  for(int i=a.length-1; i>=0;i--) {
	  
        st2=st2+a[i];
	 
	  
	  if(st2.equalsIgnoreCase(st1)){
		  System.out.println("String st1 is palindrome");
	  }
	  
  }
	}

}
