package com.example.parameterPass;

/* Passagem de parâmetro por valor e por referencia.
 * 
 * Para entender esse exemplo é necessário saber como funciona
 * a memória do java, foram criadas duas variaveis contato e valor
 * a variavel contato é uma instancia de um objetoe por ser uma instancia
 * ela tem uma referência na memória(endereço de memória,onde aquela 
 * variavel foi alocada- @EDF67894) 
 * - tipo primitivos: passagem por valor(como é feito uma cópia dentro do método, 
 * do valor original mas para uma nova variavel, se modificarmos esse vamor não irá 
 * afetar o valor original)
 * - tipos classe, enum, array : passagem por referencia(pois dentro do método será
 * feita uma cópia da referencia do objeto) 
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
