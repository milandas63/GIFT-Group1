/*
		Draw a triangle of asterisks?
			        *        
			       ***       
			      *****      
			     *******     
			    *********    
			   ***********   
			  *************  
			 *************** 
			*****************
		       *******************
 */

public class pyramid_01 {
	public static void main(String[] args) {
		int spaces = 30;
		int stars = 1;
		for(int i=0; i<10; i++) {
			for(int j=0; j<spaces; j++)
				System.out.print(" ");
			for(int j=0; j<stars; j++)  
				System.out.print("*");
			System.out.println();
			spaces--; stars+=2;
		}
	}
}
