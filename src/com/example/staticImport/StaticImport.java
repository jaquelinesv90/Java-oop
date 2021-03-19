package com.example.staticImport;

import static java.lang.Math.pow;
import static java.lang.Math.*;

/* Exemplo de import static adicionado acima, é utilizado
 * quando necessitamos chamar vários métodos de uma mesma classe.
 * 
 * Todos os métodos da classe Math são estáticos,ou seja,
 * não precisamos instanciar a classe Math para utilizar.
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
		
		/* após adicionar a palavra static ao import
		* eu posso chamar diretamente o método, esse código
		* é exatamente o mesmo da linha 21
		* */
		System.out.println(pow(a,b));
		
	}

}
