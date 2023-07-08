package com.algo;

/*
 * b)	Draw a diamond style of asterisks?
					        *
					       ***
					      *****
					     *******
					    *********
					   ***********
					  *************
					 ***************
					*****************
					 ***************
					  *************
					   ***********
					    *********
					     *******
					      *****
					       ***
					        *

*/
public class Diamond {
	public static void main(String[] args) {
		int spaces = 35;
		int stars = 1;
		
		for(int i=0; i<17; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++)  System.out.print("*");
			System.out.println();
			if(i>=8) {
				spaces++; stars-=2;
				
			} else {
				spaces--; stars+=2;
			}
		}
	}
}
