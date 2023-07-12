/*
 f)  Draw a triangle using digits from 0 to 9 for each line
                                   0
                                  111
                                 22222
                                3333333
                               444444444
                              55555555555
                             6666666666666
                            777777777777777
                           88888888888888888
*/
package com.algo;

public class pattern_F {

	public static void main(String[] args) {
		int spaces = 35;
		int stars = 1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++)  System.out.print(i);
			System.out.println();
			spaces--; stars+=2;
		}
	}
}
