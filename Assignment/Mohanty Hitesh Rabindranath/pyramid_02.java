/*
	d)	Draw a outline of a triangle using stars?
				         *         
				        * *        
				       *   *       
				      *     *      
				     *       *     
				    *         *    
				   *           *   
				  *             *  
				 *               * 
				*******************
 */

public class pyramid_02 {
	public static void main(String[] args) {
		int spaces = 30;
		int stars = 1;

		for(int i=1; i<=10; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++) {
				if(j>0 && j<(stars-1) && i<10) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			spaces--; stars+=2;
		}
	}
}
