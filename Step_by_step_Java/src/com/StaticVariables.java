package com;

public class StaticVariables {
	static  String num="Nikhil";
	public static void main(String[] args) {
		//System.out.println(StaticVariables.num);
		
		StaticVariables sta= new StaticVariables();
		sta.num="Niks";
		System.out.println(num);
		
	}
}
