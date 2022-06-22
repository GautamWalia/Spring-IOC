package com.practice;

public class Jio implements Sim {
	
	public Jio() {
		System.out.println("Jio constructor called");
	}

	@Override
	public void calling() {
System.out.println("calling using Jio Sim");
		
	}

	@Override
	public void data() {
	System.out.println("browsing internet using Jio Sim");
	}

}
