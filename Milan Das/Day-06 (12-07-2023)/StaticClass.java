package com.oops;

public class StaticClass {
	public static String name = "Mahatma Gandhi";
	public String child = "Harilal Gandhi";

	public static void main(String[] args) {
		StaticClass s1 = new StaticClass();
		StaticClass s2 = new StaticClass();
		StaticClass s3 = new StaticClass();
		System.out.println("Father: "+s1.name+"  Child: "+s1.child);
		System.out.println("Father: "+s2.name+"  Child: "+s2.child);
		System.out.println("Father: "+s3.name+"  Child: "+s3.child);
		
		s2.name = "Biju Patnaik";
		s2.child = "Naveen Patnaik";
		System.out.println("Father: "+s1.name+"  Child: "+s1.child);
		System.out.println("Father: "+s2.name+"  Child: "+s2.child);
		System.out.println("Father: "+s3.name+"  Child: "+s3.child);
				
	}
}
