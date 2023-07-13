// Write a program to reverse every word within a String?
              Example: Gandhi Institute For Technology
              Result:  ihdnaG etutitsnI roF ygolonhceT

import java.io.*;
import java.util.*;

public class ReverseWordsInStr {
    public static void main(String[] args)throws IOException{
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the String : ");
        StringBuilder Rev=new StringBuilder("");
        //StringBuilder Str= new StringBuilder(Br.readLine());
        StringTokenizer Tokens= new StringTokenizer(Br.readLine()," ");
        while(Tokens.hasMoreTokens()){
            Rev.append(Reverse(Tokens.nextToken())+" ");
        }
        System.out.println("Reversed String : "+Rev.toString());
    }
    public static String Reverse(String x){
        StringBuilder RevStr=new StringBuilder("");
        for(int i=0;i<x.length();i++){
            RevStr.insert(0,x.charAt(i));
        }
        return RevStr.toString();
    }
}
