package com.example.annotations;

/*
 * Podemos também definir onde essa anotação pode ser usada
 * em um método uma classe ou atributo
 */

@Annotations(autor = "Jaqueline", numberClass = 65)
public class Main {

	@Annotations(autor = "Jaqueline", 
			numberClass = 65
	)
	
	public static void main(String[] args) {
		
	}
}
