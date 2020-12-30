package com;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bl=-128;
		byte bh=127;
		short sl=10000;
		int i=1000000000;
	   long l=1000000000;
	   char c='a';
	   float f=0.3f;
	   double d=0.1;
	   
	   // Implicit type Casting (Implicit type casting takes place when we assign lower data type to higher data type))
	   long l1=i;
	   double d1=f;
	   int i2=bl;

	   
	   // Explicit type casting (Explicit type casting is required when we assign higher data type to lower data type)
	   
	   byte b=(byte)i;
	  short s= (short) i;
	  long l2= (long) c;
	  System.out.println(l2);
	  char q='q';
	  int q1 =(int) q;
	  System.out.println( q1);
	  int se=500;
	  byte bt=(byte)se;
	  System.out.println("The value of bt is: "+bt);
	  int sd =se;
	  System.out.println("The value of sd is : "+sd);
	  
	  //String to integer
	  String st ="11112655";
	   int a =Integer.parseInt(st);
	   System.out.println(a);
	   
	   
	   //Integer to String
	   int g=4;
	   int as=Integer.reverse(g);
	   System.out.println(Integer.reverse(as));
	   String s2=Integer.toString(g);
	   System.out.println(Integer.valueOf(s2));
	   System.out.println(s2);
	  System.out.println( Integer.reverse(g));
	  
	 
	}

}
