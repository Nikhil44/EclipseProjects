package com;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int length = args.length;
		if(length==0) {
			System.out.println("No Input Argument is provided");
		}
		else
		{
			System.out.println("List of arguments");
			
			for(int i=0; i<length;i++) {
				System.out.println(args[i]);
			}
		}

	}

}
