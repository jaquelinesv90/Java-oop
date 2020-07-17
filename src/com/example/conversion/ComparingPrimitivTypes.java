package com.example.conversion;

public class ComparingPrimitivTypes {
	
	public static void main(String[] args) {
		firstExample();
	}  
	
	public static void firstExample() {
		// int tem 32 bits
		// long tem 64 bits
		long x = 10;
		
		// não é recomendado porém, caso necessário é possível
		// fazer o casting,observar que um número excessivamente
		// grande ele não irá trazer com precisão.
		int y = (int) x;
		System.out.println(y);
	}
	
	public static void secondExample() {
		int y = 1890900;
		
		long x = y;
		System.out.println(x);
	}
}
