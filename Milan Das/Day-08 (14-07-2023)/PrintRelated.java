package com.day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintRelated {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.println("Hello World");
		
		try {
			File f = new File("help.pdf");
			long size = f.length();
			int fivePC = (int)(size*0.05);
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream("p.txt");
			int r;
			int count = 0;
			while( (r=fis.read())!=-1) {
				fos.write(r);
				count++;
				if(count>=fivePC) {
					System.out.print(".");
					count = 0;
				}
			}
			
			fos.close();
			fis.close();
			System.out.println("\nCopy successful!");
			
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}

}

abstract class ABSclass {
	public double getPIValue() {
		return 3.141;
	}

	public abstract String logValue();
}

