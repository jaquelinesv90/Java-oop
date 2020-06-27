package com.example.enumJava;

public class Test {
	
	// foram criadas duas classes uma de constantes e outra de enum
	// ambas fazem a mesma coisa mas de formas diferentes
	
	
	public static void main(String[] args) {
		constantUsing();
		EnumUsing();
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
		printDaysOfWeekConstant(DaysOfWeekConstants.SEGUNDA);
		printDaysOfWeekConstant(terca);
		printDaysOfWeekConstant(quarta);
		printDaysOfWeekConstant(quinta);
		printDaysOfWeekConstant(sexta);
		printDaysOfWeekConstant(sabado);
		printDaysOfWeekConstant(domingo);
		
	}
	
	
	private static void printDaysOfWeekConstant(int day) {
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
	
	private static void EnumUsing() {
		DaysOfWeekEnum segunda = DaysOfWeekEnum.SEGUNDA;
		DaysOfWeekEnum terca = DaysOfWeekEnum.TERCA;
		DaysOfWeekEnum quarta = DaysOfWeekEnum.QUARTA;
		DaysOfWeekEnum quinta = DaysOfWeekEnum.QUINTA;
		DaysOfWeekEnum sexta = DaysOfWeekEnum.SEXTA;
		DaysOfWeekEnum sabado = DaysOfWeekEnum.SABADO;
		DaysOfWeekEnum domingo = DaysOfWeekEnum.DOMINGO;
		
		System.out.println("Teste utilizando Enum");
		printDaysOfWeekEnum(DaysOfWeekEnum.SEGUNDA);
		printDaysOfWeekEnum(terca);
		printDaysOfWeekEnum(quarta);
		printDaysOfWeekEnum(quinta);
		printDaysOfWeekEnum(sexta);
		printDaysOfWeekEnum(sabado);
		printDaysOfWeekEnum(domingo);
	}
	
	private static void printDaysOfWeekEnum(DaysOfWeekEnum day) {
		switch (day) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("terca-feira");
			break;
		case QUARTA:
			System.out.println("quarta-feira");
			break;
		case QUINTA:
			System.out.println("quinta-feira");
			break;
		case SEXTA:
			System.out.println("sexta-feira");
			break;
		case SABADO:
			System.out.println("sabado");
			break;
		case DOMINGO:
			System.out.println("domingo");
			break;
		}
	}

}
