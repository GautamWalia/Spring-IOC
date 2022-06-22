package com.practice;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("airtel constructor called");
	}

	@Override
	public void calling() {
System.out.println("calling using Airtel Sim");
		
	}

	@Override
	public void data() {
	System.out.println("browsing internet using Airtel Sim");
	}

}
