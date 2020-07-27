package com.example.vector;

import java.util.Arrays;

public class Vector {

	private String[] elements;
	private int tamanho;

	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.tamanho = 0;
	}

	//verifica se o array está vazio, quando encontrar a primeira
	// posição vazia ele  adiciona o elemento e para a pesquisa
	public void add(String element) {
		for (int i = 0; i < this.elements.length; i++) {
			if (this.elements[i] == null) {
				this.elements[i] = element;
				break;
			}
		}
	}

	// método add melhorado, para sabel qual foi a
	// ultima posição que guardamos elementos
	public void add1(String element) throws Exception {

		if (this.tamanho < this.elements.length) {//verifica se o tamanho é menor que a capacidade do vetor
			this.elements[this.tamanho] = element;
			this.tamanho++;
		} else {
			throw new Exception("Vetor cheio,não adicionar mais elementos");
		}
	}
	
	// verificando o tamanho real(que pode ser diferente da capacidade) do vetor
	public int tamanho() {
		return this.tamanho;
	}
	
	// classe Array é uma classe utilitária que serve para podermos
	// trabalhar com coleções de objetos(ex. vetores)
	// esse método foi gerado automaticamente pelo eclipse
	// StringBuilder permite criar e manipular Strings
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i =0; i <this.tamanho-1; i++) {
			s.append(this.elements[i]);
			s.append(",");
		}
		
		if(this.tamanho >0) {
			s.append(this.elements[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	// obter elemento de determinada posição
	public String search(int position) {
		if(!(position >= 0 && position < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return elements[position];
	}
}
