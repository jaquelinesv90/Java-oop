package com.example.conversion;

public class ComparingPrimitivTypes {
	
	public static void main(String[] args) {
		firstExample();
	}  
	
	public static void firstExample() {
		// int tem 32 bits
		// long tem 64 bits
		long x = 10;
		
		// n�o � recomendado por�m, caso necess�rio � poss�vel
		// fazer o casting,observar que um n�mero excessivamente
		// grande ele n�o ir� trazer com precis�o.
		int y = (int) x;
		System.out.println(y);
	}
	
	public static void secondExample() {
		int y = 1890900;
		
		long x = y;
		System.out.println(x);
	}
}
