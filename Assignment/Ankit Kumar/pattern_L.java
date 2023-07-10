/*
 l)  Draw a triangle arrow like figure showing left direction
 
			              *
			            ***
			          *****
			        *******
			      *********
			    ***********
			  *************
			***************
			  *************
			    ***********
			      *********
			        *******
			          *****
			            ***
			              *

*/
package com.algo;

public class pattern_L {

	public static void main(String[] args) {
		int spaces = 35;
		int stars = 1;
		
		for(int i=0; i<17; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++)  System.out.print("*");
			System.out.println();
			if(i>=8) {
				spaces+=2; stars-=2;
				
			} else {
				spaces-=2; stars+=2;
			}
		}

	}

}
