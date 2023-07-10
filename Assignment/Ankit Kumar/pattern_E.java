/*
 e) Draw a triangle of palindrome alphabets?

				         a         
				        aba        
				       abcba       
				      abcdcba      
				     abcdedcba     
				    abcdefedcba    
				   abcdefgfedcba   
				  abcdefghgfedcba  
				 abcdefghihgfedcba 
				abcdefghijihgfedcba


 */
package com.algo;

public class pattern_E {

	public static void main(String[] args) {

		int spaces = 35;
			for(char i='a'; i<='j'; i++) {
				for(int j=0; j<spaces; j++) System.out.print(" ");
				for(char j='a'; j<=i; j++)     System.out.print(j);
				for(char j=(char)(i-1); j>='a'; j--)  System.out.print(j);
				System.out.println();
				spaces--;
			}
	}
}
