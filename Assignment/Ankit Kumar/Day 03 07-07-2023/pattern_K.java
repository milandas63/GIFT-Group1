/*
 	k)  Draw a triangle arrow like figure showing right direction
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

public class pattern_K {

	public static void main(String[] args) {
		int stars = 1;
		for(int i=0; i<17; i++) {
			for(int j=0; j<stars; j++)  System.out.print("*");
			System.out.println();
			if(i>=8) {
				stars-=2;
			} else {
				stars+=2;
			}
		}
	}

}
