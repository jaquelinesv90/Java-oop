package com.example.staticImport;

import static java.lang.Math.pow;
import static java.lang.Math.*;

/* Exemplo de import static adicionado acima, � utilizado
 * quando necessitamos chamar v�rios m�todos de uma mesma classe.
 * 
 * Todos os m�todos da classe Math s�o est�ticos,ou seja,
 * n�o precisamos instanciar a classe Math para utilizar.
 * 
 */
public class StaticImport {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		//calculo de potencia (2 elevado a 3, ou seja: 2*2*2)
		System.out.println(Math.pow(a, b));
		
		//calculo de raiz quadrada
		System.out.println(Math.sqrt(c));
		
		/* ap�s adicionar a palavra static ao import
		* eu posso chamar diretamente o m�todo, esse c�digo
		* � exatamente o mesmo da linha 21
		* */
		System.out.println(pow(a,b));
		
	}

}
