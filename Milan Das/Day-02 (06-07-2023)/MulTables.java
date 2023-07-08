package com.algo;

/*
 * Write a program to generate all multiplication tables between 2 through 10
 */

public class MulTables {

	public static void main() {
		System.out.println("Hello World");

	}

	public static void main(String[] x) {
		for(int i=2; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		System.out.println();
		for(int h=2; h<=12; h+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=h; j<=(h+4); j++) {
					System.out.print(padL(j,2)+" x "+padL(i,2)+" = "+padL((j*i),3)+"  ");
					if(j>=12) break;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static String padL(int n, int len) {
		String retVal = ""+n;
		for(int i=retVal.length(); i<len; i++) {
			retVal = " "+retVal;
		}
		return retVal;
	}
}
