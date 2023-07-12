package com.algo;

public class countVowels {

	public static void main(String[] args) {
	        String word = "This is an example";
	        int vowel=0;
	        System.out.println(word);
	        for(int i=0; i<word.length(); i++){
	            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
	                vowel++;
	            }
	        }
	        System.out.println("Total Number of Vowels in this string is "+vowel);
	}
}
