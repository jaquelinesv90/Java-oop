package com.example.annotations;

/* Anotações são metadados que permitem embutir informações
 * complementares no código fonte.
 * Essas informações podem ser consumidas de três maneiras diferentes:
 *  1.Informações para o compilador
 *  2.Runtime(tempo de execução)
 *  3.Compile ou Deploy-time(tempo de compilação ouu deploy-web)
 */

@interface Annotations {
	
	String  autor();
	int numberClass();
	String blog() default "http://loiane.com";

}
