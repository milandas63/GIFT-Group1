package com.oops;

public class Inheritance {
	public final double PI = 3.141;
	
	public Inheritance() {
		
	}
	
	public double setValue() {
		//PI = 5.36; 		Not allowed
		return PI;
	}
	
	public final String planet() {
		return "Earth";
	}
	
	public String planetName() {
		return "Jupiter";
	}
}

final class IntRate extends Inheritance {
	public IntRate() {
		
	}
	
	//	Can't override a final method
	//public String planet() {
	//	return "Mercury";
	//}
	
	
}