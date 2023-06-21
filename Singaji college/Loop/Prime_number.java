package com.Loop;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
// prime number
		int num,tem=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Check Prime number");
		num=s.nextInt();//5,
		for (int i=2;i<=num-1;i++) {//2<5
		if (num%i==0) {//5%2,3,4
			tem=tem+1;
		}
	}
	if(tem==0) {
		System.out.println("This is prime number");
	}else {
	System.out.println("This is not prime number");	
	}
	}

}
