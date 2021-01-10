package com.example.parameterPass;

/* Passagem de par�metro por valor e por referencia.
 * 
 * Para entender esse exemplo � necess�rio saber como funciona
 * a mem�ria do java, foram criadas duas variaveis contato e valor
 * a variavel contato � uma instancia de um objetoe por ser uma instancia
 * ela tem uma refer�ncia na mem�ria(endere�o de mem�ria,onde aquela 
 * variavel foi alocada- @EDF67894) 
 * - tipo primitivos: passagem por valor(como � feito uma c�pia dentro do m�todo, 
 * do valor original mas para uma nova variavel, se modificarmos esse vamor n�o ir� 
 * afetar o valor original)
 * - tipos classe, enum, array : passagem por referencia(pois dentro do m�todo ser�
 * feita uma c�pia da referencia do objeto) 
 */

public class ParameterClass {
	
	
	public static void main(String[] args) {
		
	}
	
	private static void testReferenceValuePass(int value, Contact contact) {
		int newValue = value + 10;
		value = newValue;
		
		contact = new Contact("conta2","2345","test@gmail.com");
	}
	
}
