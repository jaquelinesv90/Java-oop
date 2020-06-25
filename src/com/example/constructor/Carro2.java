package com.example.constructor;


//Toda classe tem um construtor simples e vazio
// por padrão;
// Uma boa prática é sempre que criar um construtor com parametro
// criar um vazio também, pois alguns frameworks necessitam de 
// um construtor vazio.
public class Carro2 {

	String marca;  
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	public Carro2(String marca, String modelo, int numPassageiros,
			double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	// pode ser declarado assim
	public Carro2() {
		
	}
	
	// ou assim
	// public Carro2() {}
}