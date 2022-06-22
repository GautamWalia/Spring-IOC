package com.practice;

public class Vodafone implements Sim {

	@Override
	public void calling() {
System.out.println("calling using Vodafone Sim");
		
	}

	@Override
	public void data() {
	System.out.println("browsing internet using Vodafone Sim");
	}

}
