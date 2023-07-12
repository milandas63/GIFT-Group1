/*
 g)  Draw the figure shown in number g
 
	1               1
	12             21
	123           321
	1234         4321
	12345       54321
	123456     654321
	1234567   7654321
	12345678 87654321
	12345678987654321

*/

package com.algo;

public class pattern_G {

	public static void main(String[] args) {
		int spaces = 15;
		int lnum = 1;
		int n=9;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=lnum; j++)  System.out.print(j);
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=i; j>0; j--) {
				if(j==9) {
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
			spaces-=2; lnum+=1;
		}
	}
}
