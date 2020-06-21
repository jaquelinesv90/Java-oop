package com.example.constructor;

public class TesteCarro {

	public static void main(String[] args) {
		  
		// ao invés disso
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		// pode-se fazer isso
		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);
		
		Carro2 carro2 = new Carro2();
	}
}
