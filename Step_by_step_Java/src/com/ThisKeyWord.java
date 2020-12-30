package com;

public class ThisKeyWord {
	 int x=1;
	
	ThisKeyWord(){
		System.out.println(this);
		System.out.println(this.x);
		System.out.println(this.thiskeyword());
	}
	

	public int  thiskeyword() {
		System.out.println("This non static method");
		return 1;
	}
	public static void main(String[] args) {
		new ThisKeyWord();
		new ThisKeyWord();
	
		
	}

}
