package com;

public class NonStaticMembers {

	int num;
	NonStaticMembers(){
		System.out.println("Inside constructor");
	}
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMembers nonstaticObject= new NonStaticMembers();
		nonstaticObject.num=5;
		
		
	}

}
