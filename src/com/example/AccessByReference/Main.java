package com.example.AccessByReference;

public class Main {
	
	//Quando declaramos uma variavel para associar a um objeto, essa variavel
	//n�o guarda o objeto, e sim uma maneira de acess�-lo, chamada de refer�ncia.
	public static void main(String[] args) {
		Person p;
		p = new Person();
		
		// o new, depois de alocar a mem�ria para o objeto, devolve um valor de refer�ncia.
	}
   
	// O correto aqui, � dizer que p se refere a um objeto.N�o � correto dizer que p � 
	// um objeto, pois p � uma variavel de refer�ncia.Tenho uma refer�ncia a um objeto
	// do tipo Person.
}
