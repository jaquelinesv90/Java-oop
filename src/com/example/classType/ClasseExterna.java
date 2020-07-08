package com.example.classType;

// a classe interna tem acesso a todos os métodos
// da classe externa

/**
 * um exemplo do uso de classes internas é quando você quer implementar uma interface
 * sem violar o encapsulamento de sua classe.
 * 
 *ocultar classes que só fazem sentido associadas a classe principal.Por
 *exemplo, você vai ter uma classe ListaEncadeada.Toda lista é um conjunto
 *de nós, mas o conjunto de nós só tem sentido para a classe da lista. Então, porque
 *deixar o nó público? A classe Nó poderia se interna privada da lista.
 */
public class ClasseExterna {
	
	private int valor;
	
	public void atribuiValor(){
		valor = 10;
	}
	 //classe interna
	public class ClasseInterna{
		
		public void imprimir(){
			System.out.print(valor);
		}
		
	}
	

}
