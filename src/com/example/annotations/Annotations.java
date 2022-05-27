package com.example.annotations;

/* Anota��es s�o metadados que permitem embutir informa��es
 * complementares no c�digo fonte.
 * Essas informa��es podem ser consumidas de tr�s maneiras diferentes:
 *  1.Informa��es para o compilador
 *  2.Runtime(tempo de execu��o)
 *  3.Compile ou Deploy-time(tempo de compila��o ou deploy-web)
 *  
 *  Metadados s�o dados que fazem referencia aos pr�prios dados.
 *  
 */

@interface Annotations {
	
	String  autor();
	int numberClass();
	String blog() default "http://loiane.com";

}
