package com.Loop;
import java.util.Scanner;
public class Factorial_value{
	public static void main(String[] args) {
		System.out.println("Enter number for factorial value");
		int num;
		int fac=1;
		Scanner S = new Scanner(System.in);
		num=S.nextInt();
		//for(int i=1;i<=num;i++) {
		for(int i=num;i>=1;i--) {
		fac*=i;
		}
System.out.println("Factorial is :"+fac);
}
}