package com.example.annotations;

/*
 * Podemos tamb�m definir onde essa anota��o pode ser usada
 * em um m�todo uma classe ou atributo
 */

@Annotations(autor = "Jaqueline", numberClass = 65)
public class Main {

	@Annotations(autor = "Jaqueline", 
			numberClass = 65
	)
	
	public static void main(String[] args) {
		
	}
}
