package com.example.stack;

public class StaticStructure<T> {
	
	private T[] elements;
	private int size;
	
	public StaticStructure(int capacity){
		this.elements = (T[])new Object[capacity];
		this.size = 0;
	}
	
	public StaticStructure(){
		this(10);
	}
}
