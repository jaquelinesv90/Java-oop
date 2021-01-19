package com.example.recursion;

/* fun��o recursiva � uma fun��o que chama a si mesma
 * � necess�rio um ponto de parada
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