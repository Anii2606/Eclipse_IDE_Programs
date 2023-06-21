package com.Loop;

import java.util.Scanner;

// recursion is nothing but called the method again and again by itself
public class Factorial_By_Recursion {
	static int fac=1;
	
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number");
	int num;
	num=s.nextInt();
	Factorial_By_Recursion ob=new Factorial_By_Recursion();
	ob.recursion(num);
	System.out.println("Factorial of "+num+" is "+fac);
	}
	 static void recursion(int a) {
		if(a>1) {
			fac*=a;
			recursion(a-1);
		}
	
		
	}

}
