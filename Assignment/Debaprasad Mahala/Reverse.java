Write a program to reverse the words in a given String?
  //            Example: God is Omnipotent and Omniscient
    //          Result:  Omniscient and Omnipotent is God


import java.io.*;
import java.util.*;

public class ReverseTest{
    public static void main(String[] args)throws IOException{
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The String : ");
        //StringBuilder Str= new StringBuilder(Br.readLine());
        StringBuilder Rev= new StringBuilder("");
        StringTokenizer Tokens= new StringTokenizer(Br.readLine(), " ");
        while(Tokens.hasMoreTokens()){
            Rev.insert(0," "+Tokens.nextToken());
        }
        System.out.println("Reversed String : "+ Rev.toString());
        
    }

}
