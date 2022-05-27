package com.example.exceptions;

public class ExceptionExample {
	
	public static void main(String[] args) {
		int nums[] = new int[4];
		
		try{
			System.out.println(" before exception");
			nums[0] = 10;
			System.out.println(" you won't see this message ");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(" throw exception");
		}
		System.out.println("after exception");		
	}

}
