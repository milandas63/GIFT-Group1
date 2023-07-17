package com.algo;

public class perfect_num {

	public static void main(String[] args) {
		int first = 6, last = 10000; 
		System.out.println("Perfect numbers between " + first + " and " + last + " are :");
		for (int num = first; num <= last; num++) {
			if (check_perfect(num)) {
				System.out.println(num);
			}
		}
	}
	public static boolean check_perfect(int num) {
		int s = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				s += i;
			}
		}
		return s == num;
	}
}
