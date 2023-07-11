Reverse the given string






public class Reverse   
{    
    public static void main(String[] args) {    
        String Tg = "Gandhi Institute For Technology";      
        String reversedTg = " ";      
        for(int i = Tg.length()-1; i >= 0; i--){    
            reversedTg = reversedTg + Tg.charAt(i);    
        }    
            
        System.out.println("Original string: " + Tg);    
        System.out.println("Reverse of given string: " + reversedTg);    
    }    
}    