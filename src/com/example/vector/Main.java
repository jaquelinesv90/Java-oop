package com.example.vector;

public class Main {
	
	public static void main(String args[]){
		Vector vector = new Vector(5);

		try {
			vector.add1("elemento 1");
			vector.add1("elemento 2");
			
			System.err.println(vector.search(0));
			
			System.out.println(vector.tamanho());
			System.out.println(vector.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
