package com.tcs.abstraction;

public abstract class Staff {
	private String name;
	
	public void fillTimesheet() {
		
	}
	public abstract void work();
}

class HR extends Staff {
	
	@Override
	public void work() {
		System.out.println("HR is working");
	}
}

class Gaurd extends Staff {
	

	public void work() {
		System.out.println("Gaurd is working");
	}
}