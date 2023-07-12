package com.algo;

/*
	1.    Write a program to reverse a String 
	      Example: Gandhi Institute For Technology
	      Result:  ygolonhceT roF etutitsnI ihdnaG
	
	2.    Write a program to reverse the words in a given String?
	      Example: God is Omnipotent and Omniscient
	      Result:  Omniscient and Omnipotent is God
	
	3.    Write a program to reverse every word within a String?
	      Example: Gandhi Institute For Technology
	      Result:  ihdnaG etutitsnI roF ygolonhceT
 */

public class ReverseString {

	public static void main(String[] args) {
		String text = "God is Omnipotent and Omniscient";
		String arr[] = text.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n----------------------------------------------");
		text = "Gandhi Institute For Technology";
		String arr2[] = text.split(" ");
		for(int i=0; i<arr2.length; i++) {
			for(int j=arr2[i].length()-1; j>=0; j--) {
				System.out.print(arr2[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}
