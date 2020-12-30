package com;

public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method1");
		System.out.println(StaticMethods.staticmethod("Static method inside main method"));
		System.out.println("Inside main method");
	}
	static String staticmethod(String str) {
		
		return str;
	}
	public void nonstaticmethod() {
		System.out.println("Non Static method");
	}
	static {
		//static methods can be called inside static block
		System.out.println(StaticMethods.staticmethod("Static method inside static block"));
		System.out.println("Inside static block");
		StaticMethods staticobject = new StaticMethods();
		staticobject.nonstaticmethod();
		
	}

}
