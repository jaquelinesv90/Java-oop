package com.example.stack;

public class StaticStructure<T> {
	
	private T[] elements;
	private int tamanho;
	
	public StaticStructure(int capacity){
		this.elements = (T[])new Object[capacity];
		this.tamanho = 0;
	}
	
	public StaticStructure(){
		this(10);
	}
}
