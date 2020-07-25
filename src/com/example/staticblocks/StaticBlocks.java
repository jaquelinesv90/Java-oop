package com.example.staticblocks;

public class StaticBlocks {
	
	/**
	 * o bloco é executado antes do construtor,
	 * o objetivo é inicializar atributos e metodos
	 * estaticos.É executado uma unica vez quando 
	 * quando a classe é carregada na memoria
	 */
	static{
		System.out.println("static block");
	}
	
	
	public static void main(String[] args){
		System.out.println("main");
	}
	
	public StaticBlocks(){
		System.out.println("constructor");
	}
}
