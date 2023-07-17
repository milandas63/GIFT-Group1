package com.pack;

public class ExceptionExample {

	public static void main(String[] args) {
		int n = 25;
		int i = 0;
		try {
			System.out.println("First line");
			System.out.println(n/i);
			System.out.println("This is the 2nd line");
			System.out.println("There was no exception");
        } catch(NumberFormatException e) {
        	System.err.println("NumberFormatException");
        } catch(StringIndexOutOfBoundsException e) {
        	System.err.println("StringIndexOutOfBoundsException");
        } catch(ArithmeticException e) {
        	System.err.println("ArithmeticException");
        } catch(IndexOutOfBoundsException e) {
        	System.err.println("IndexOutOfBoundsException");
        } catch(WrongException e) {
        	System.err.println("IndexOutOfBoundsException");
        }
	}
}

class WrongException extends RuntimeException {
	
}