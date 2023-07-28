/*
   Write a program to reverse every word within a String?
      Example: Gandhi Institute For Technology
      Result:  ihdnaG etutitsnI roF ygolonhceT
 */
public class reverse_string03{
    public static void main(String[] args) {
       String text = "Gandhi Institute For Technology";
       System.out.println("The Entered String:"+" " + text);
       String[] arr = text.split(" ");
       System.out.print("The Reverse String:"+" ");
       for(int i=0;i<arr.length;i++){
          String temp=arr[i];
          for(int j=temp.length()-1;j>=0;j--){
             System.out.print(temp.charAt(j));            
          }
          System.out.print(" ");
          //System.out.print(arr[i]);
       }
 }
 }
 