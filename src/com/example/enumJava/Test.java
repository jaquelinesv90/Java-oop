package com.example.enumJava;

public class Test {
	
	public static void main(String[] args) {
		constantUsing();
	}
	
	private static void constantUsing() {
		//int segunda = DaysOfWeekConstants.SEGUNDA;
		int terca = DaysOfWeekConstants.TERCA;
		int quarta = DaysOfWeekConstants.QUARTA;
		int quinta = DaysOfWeekConstants.QUINTA;
		int sexta = DaysOfWeekConstants.SEXTA;
		int sabado = DaysOfWeekConstants.SABADO;
		int domingo = DaysOfWeekConstants.DOMINGO;
		
		System.out.println("teste utilizando constantes no Java");
		printDaysOfWeek(DaysOfWeekConstants.SEGUNDA);
		printDaysOfWeek(terca);
		printDaysOfWeek(quarta);
		printDaysOfWeek(quinta);
		printDaysOfWeek(sexta);
		printDaysOfWeek(sabado);
		printDaysOfWeek(domingo);
		
	}
	
	
	private static void printDaysOfWeek(int day) {
		switch (day) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("terca-feira");
			break;
		case 3:
			System.out.println("quarta-feira");
			break;
		case 4:
			System.out.println("quinta-feira");
			break;
		case 5:
			System.out.println("sexta-feira");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		}
	}

}
