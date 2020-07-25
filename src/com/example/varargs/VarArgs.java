package com.example.varargs;

/**
 * VarArgs - varios argumentos, é utilizado quando não sabemos de antemão
 * quantos argumentos serão necessários.
 */

public class VarArgs {
	
	public static void main(String[] args){
		//value(2,4,5);
	}
	
	// os valores ficam armazenados em um vetor
	public static int[] value(int... b){
		return b;
	}
	
	// somente o ultimo parametro pode ser vararg
	public static void value(int a, int b, int... c){
		
	}

}