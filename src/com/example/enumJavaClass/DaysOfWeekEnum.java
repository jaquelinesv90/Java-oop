package com.example.enumJavaClass;

public enum DaysOfWeekEnum {
	
	SEGUNDA(1), TERCA(2),QUARTA(3),QUINTA(4),SEXTA(5),SABADO(6),DOMINGO(7);
	
	private int value;
	
	DaysOfWeekEnum(int value){
		this.value = value;
	}
	
	// pode-se ter m�todos nessa classe tamb�m
	public int getValue() {
		return this.value;
	}

}
