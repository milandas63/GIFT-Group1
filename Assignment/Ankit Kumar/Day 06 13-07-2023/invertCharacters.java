package com.algo;

public class invertCharacters {

	public static void main(String[] args) {
		
		String word = "Quick Brown Fox Jumps Over The Lazy Dog";
		int ascii;
		char ch;
		
		System.out.println(word);
		
		char[] str = new char[word.length()];
		char[] str_new = new char[word.length()];
		
		for(int i=0; i<word.length(); i++) {
			str[i] = word.charAt(i);
		}
		for(int i=0; i<word.length(); i++){
			ch = str[i];
			ascii = ch;
			if(word.charAt(i)>=65 && word.charAt(i)<=90){
				ascii = ascii + 32;
				ch = (char)ascii;
				str_new[i]=ch;
			}
			else if (word.charAt(i)>=97 && word.charAt(i)<=122){
				ascii = ascii - 32;
				ch = (char)ascii;
				str_new[i]=ch;
			}
			else if (word.charAt(i)==32) {
				str_new[i]=ch;
			}
		}
		System.out.println(str_new);
		}
	}
