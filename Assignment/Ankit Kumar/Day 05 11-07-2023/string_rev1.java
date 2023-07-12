package com.algo;

public class string_rev1 {
	
    public static void main (String [] args)
    {
        String reverse= new String();
        String word="Gandhi Institute For Technology";
        
        for (int i = word.length()-1; i>=0; i--)
        {
            reverse += word.charAt(i);
        }
        System.out.println(word);
        System.out.println("-------------------------------");
        System.out.println(reverse);
    }
}