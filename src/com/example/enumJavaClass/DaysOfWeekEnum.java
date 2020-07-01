package com.example.enumJavaClass;

// Não existe herança para enum
//Enums podem se comparados usando ==
//Não podem ser instanciados com new
//Podem implementar interfaces
//Podem ser declarados separadamente ou dentro de classe
public enum DaysOfWeekEnum {
	
	// ao acrescentar um valor
	// dentro do parenteses ja estamos
	// chamando o método construtor
	SEGUNDA(1), TERCA(2),QUARTA(3),QUINTA(4),SEXTA(5),SABADO(6),DOMINGO(7);
	
	private int value;
	
	//construtor sem modificador de acesso pois
	//o construtor é utilizado internamente
	DaysOfWeekEnum(int value){
		this.value = value;
	}
	
	// pode-se ter métodos nessa classe também
	public int getValue() {
		return this.value;
	}

}
