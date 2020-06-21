package com.example.constructor;

// A classe pode ter quantos construtores quiser
public class Carro {

	String marca;
	String modelo; 
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// Se ja existe um valor padrão para o atributo
	// é mais elegante adicioná-lo já no construtor
	Carro(){
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
}
