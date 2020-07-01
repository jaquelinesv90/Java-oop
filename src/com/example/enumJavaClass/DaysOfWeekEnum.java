package com.example.enumJavaClass;

// N�o existe heran�a para enum
//Enums podem se comparados usando ==
//N�o podem ser instanciados com new
//Podem implementar interfaces
//Podem ser declarados separadamente ou dentro de classe
public enum DaysOfWeekEnum {
	
	// ao acrescentar um valor
	// dentro do parenteses ja estamos
	// chamando o m�todo construtor
	SEGUNDA(1), TERCA(2),QUARTA(3),QUINTA(4),SEXTA(5),SABADO(6),DOMINGO(7);
	
	private int value;
	
	//construtor sem modificador de acesso pois
	//o construtor � utilizado internamente
	DaysOfWeekEnum(int value){
		this.value = value;
	}
	
	// pode-se ter m�todos nessa classe tamb�m
	public int getValue() {
		return this.value;
	}

}
