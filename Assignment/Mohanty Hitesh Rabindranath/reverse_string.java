
/*
Write a program to reverse a String 
      Example: Gandhi Institute For Technology
      Result:  ygolonhceT roF etutitsnI ihdnaG
*/

public class reverse_string{
    public static void main(String[] args){
        String college="Gandhi Institute For Technology";
        System.out.println("ENTERED STRING:" + " " + college);
        for(int i=college.length()-1;i>=0;i--){
            System.out.print(college.charAt(i));
        }
    }
}
