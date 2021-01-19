package com.example.garbageCollector;

// classe incompleta
public class Collector {
	
	public static void getUsedMemory() {
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime();//padrão singleton
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
	}
	

	public static void main(String[] args) {
		Contact[] contacts = new Contact[10000];
		Contact c;
		
		for(int i = 0; i< contacts.length; i++) {
			 c = new Contact("Contact" +i, "1234-4567"+i,"contact:"+i+"@email.com");
			 contacts[i] = c;
		}
		
		System.out.println("created contact: ");
		
		c = null;
		
		System.out.println("removed contacts from memory");
		
	}
}
