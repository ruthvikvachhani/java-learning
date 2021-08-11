package com.tcs.final1.keyword;

public class Ticket {// we cannot extend this class from other class.
	private final String movie = "Sholay";// we have to initialize final variable where we define it.
	private float price;
	
	public final void sell() {// final method cannot be override but can be overload
		
	}
	
	public final void sell(float price) {
		
	}
}

public IllegalTicket extends Ticket{
	
	public final void sell() {
		
	}
}