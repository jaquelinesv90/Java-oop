package com.example.constructor;


/*Toda classe tem um construtor simples e vazio
 por padrão;
 Uma boa prática é sempre que criar um construtor com parametro
 criar um vazio também, pois alguns frameworks necessitam de 
 um construtor vazio.
 O construtor sem argumentos é um requerimento para todas as 
 classes persistentes.O hibernate precisa criar para você os objetos 
 usando Java Reflection(permite que um programa java em execução examine ou "faça
 uma introspecção" sobre si mesmo e manipule as propriedades internas do programa).
 O construtor pode ser privado, porém a visibilidade do pacote é requerida para a 
 procuração da geração em tempo de execução e recuperação eficiente dos dados sem a
 instrumentação de bytecode.
 documentação: https://docs.jboss.org/hibernate/orm/3.5/reference/pt-BR/html_single/#persistent-classes-pojo-constructor
*/
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