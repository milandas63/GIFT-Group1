package com.voter;

public class CheckAge {

	public static void main(String[] args) {
		int[] ages = {36, 25, 11, 47, 61, -19, 77, 93, 72, 12, 15, 84};

		int age;
		for(int i=0; i<ages.length; i++) {
			age = ages[i];
			try {
				checkAge(age);
				System.out.println(age+ " Age is valid");
			} catch(TooYoungAgeException e) {
				System.err.println(age+" "+e.getMessage());
			} catch(TooOldAgeException e) {
				System.err.println(age+" "+e.getMessage());
			} catch(NegativeAgeException e) {
				System.err.println(age+" "+e.getMessage());
			} catch(ZeroAgeException e) {
				System.err.println(age+" "+e.getMessage());
			} catch(Exception e) {
				System.err.println(e);
			}
		}
	}

	public static boolean checkAge(int age) throws TooYoungAgeException,
												   TooOldAgeException,
												   NegativeAgeException,
												   ZeroAgeException {

		if(age<0) throw new NegativeAgeException("age less than 0");
		if(age==0) throw new ZeroAgeException("age is zero");
		if(age<18) throw new TooYoungAgeException("age is below 18");
		if(age>90) throw new TooOldAgeException("age is above 90");

		return true;
	}
}

class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {super(message);}
}

class WrongAgeException extends AgeException {
	public WrongAgeException() {}
	public WrongAgeException(String message) {super(message);}
}

class TooYoungAgeException extends WrongAgeException {
	public TooYoungAgeException() {}
	public TooYoungAgeException(String message) {super(message);}
}

class TooOldAgeException extends WrongAgeException {
	public TooOldAgeException() {}
	public TooOldAgeException(String message) {super(message);}
}

class InvalidAgeException extends AgeException {
	public InvalidAgeException() {}
	public InvalidAgeException(String message) {super(message);}
}

class NegativeAgeException extends InvalidAgeException {
	public NegativeAgeException() {}
	public NegativeAgeException(String message) {super(message);}
}

class ZeroAgeException extends InvalidAgeException {
	public ZeroAgeException() {}
	public ZeroAgeException(String message) {}
}
