/*
	h)  Draw the figure shown in number h
		
		12345678987654321
		12345678 87654321
		1234567   7654321
		123456     654321
		12345       54321
		1234         4321
		123           321
		12             21
		1               1

 */

package com.algo;

public class pattern_H {

	public static void main(String[] args) {
		int spaces = 0;
		int lnum = 9;
		int n=9;
		for(int i=n; i>0; i--) {
			for(int j=1; j<=lnum; j++)  System.out.print(j);
			for(int j=1; j<spaces; j++) System.out.print(" ");
			for(int j=i; j>0; j--) {
				if(j==n) {
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
			spaces+=2; lnum-=1;
		}
	}
}
