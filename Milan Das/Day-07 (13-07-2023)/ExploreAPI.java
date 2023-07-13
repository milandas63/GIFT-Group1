package com.day7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.helper.Routine;

public class ExploreAPI {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		//DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);		// 	Thursday, 13 July, 2023
		//DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);	//	13 Jul, 2023
		//DateFormat format = DateFormat.getDateInstance(DateFormat.LONG);		//	13 Jul, 2023
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);		//	13/7/23
		System.out.println(format.format(today));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = scan.nextLine();
		System.out.println(name);
		
		Routine r = new Routine();
		System.out.println(r.padL(12324252, 35));
		System.out.println(r.padC(12324252, 35));
		System.out.println(r.padR(12324252, 35));

		String text = "Quick Brown Fox Jumps Over The Lazy Dog";
		StringTokenizer tokens = new StringTokenizer(text);
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

	
		text = "Quick,Brown,Fox,Jumps,Over,The,Lazy,Dog";
		tokens = new StringTokenizer(text,",");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
	}

}
