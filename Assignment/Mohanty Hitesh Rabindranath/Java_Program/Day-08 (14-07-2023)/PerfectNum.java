/*
    Write a program to check whether the entered number is perfect or not?
    (A PERFECT number is that number which is equal to the sum of all numbers divisible to it)
*/
import java.util.Scanner;  
public class PerfectNum{  
  public static void main(String args[]){  
    long n, sum=0;  
    Scanner sc=new Scanner(System.in);         
    System.out.print("Enter the number: ");  
    n=sc.nextLong();  
    int i=1;  
    while(i <= n/2){
      if(n % i == 0){
        Sum = sum + i;  
        }
      i++;  
      }
    if(sum==n){
      System.out.println(n+" is a perfect number.");  
    }
    else  
    System.out.println(n+" is not a perfect number.");
  }  
}  
