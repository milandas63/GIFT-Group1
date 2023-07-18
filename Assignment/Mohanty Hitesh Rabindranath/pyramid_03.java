
/*write a program to Draw a triangle of palindrome alphabets? 
 *                              
 *                            A     
                             ABA    
                            ABCBA   
                           ABCDCBA  
                          ABCDEDCBA 
                         ABCDEFEDCBA
                        ABCDEFGFEDCBA  
                       ABCDEFGHGFEDCBA 
                      ABCDEFGHIHGFEDCBA
 * 
*/

public class Pyramid3 {
    public static void main(String[] args) {
        int spaces = 30;
        for (int i = 65; i <= 73; i++) {

            for (int a = 0; a < spaces; a++) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= (char) i; j++) {
                System.out.print(j);
            }
            for (char j = (char) (i - 1); j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces--;
        }
    }
}
