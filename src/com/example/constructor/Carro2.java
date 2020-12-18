package com.example.constructor;


/*Toda classe tem um construtor simples e vazio
 por padr�o;
 Uma boa pr�tica � sempre que criar um construtor com parametro
 criar um vazio tamb�m, pois alguns frameworks necessitam de 
 um construtor vazio.
 O construtor sem argumentos � um requerimento para todas as 
 classes persistentes.O hibernate precisa criar para voc� os objetos 
 usando Java Reflection(permite que um programa java em execu��o examine ou "fa�a
 uma introspec��o" sobre si mesmo e manipule as propriedades internas do programa).
 O construtor pode ser privado, por�m a visibilidade do pacote � requerida para a 
 procura��o da gera��o em tempo de execu��o e recupera��o eficiente dos dados sem a
 instrumenta��o de bytecode.
 documenta��o: https://docs.jboss.org/hibernate/orm/3.5/reference/pt-BR/html_single/#persistent-classes-pojo-constructor
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