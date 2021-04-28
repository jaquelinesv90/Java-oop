package com.example.AccessByReference;

public class Main {
	
	//Quando declaramos uma variavel para associar a um objeto, essa variavel
	//não guarda o objeto, e sim uma maneira de acessá-lo, chamada de referência.
	public static void main(String[] args) {
		Person p;
		p = new Person();
		
		// o new, depois de alocar a memória para o objeto, devolve um valor de referência.
	}
   
	// O correto aqui, é dizer que p se refere a um objeto.Não é correto dizer que p é 
	// um objeto, pois p é uma variavel de referência.Tenho uma referência a um objeto
	// do tipo Person.
}
