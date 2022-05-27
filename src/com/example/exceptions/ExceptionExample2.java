package com.example.exceptions;

public class ExceptionExample2 {
	
	static class ExecTest{
		static void genException() {
			int nums[] = new int[4];
			
			System.out.println(" before exception");
			
			// generating the exception here
			nums[7] = 10;
			System.out.println("this won't be displayed");
		}
	}	
	
	static class ExecDemo{
		public static void main(String args[]) {
			try {
				ExecTest.genException();
			}catch(ArrayIndexOutOfBoundsException exc){
				System.out.println("index out-of-bounds");
			}
			System.out.println("after catch statement");
		}
	}

}
