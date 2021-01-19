package com.example.recursion;

/* função recursiva é uma função que chama a si mesma
 * é necessário um ponto de parada
 */
public class Calculator {
	
	// sem recursividade
	public static int fatorialNonRecursion(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		int total = 1;
		for(int i = num; i>1; i--) {
			total *= i;
		}
		
		return total;
	}

	// com recursividade
	public static int fatorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		return num * fatorial(num-1);
	}
}