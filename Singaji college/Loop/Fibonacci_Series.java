package com.Loop;

import java.util.Scanner;

public class Fibonacci_Series {//0,1,1,2,3,5,8,13,21,34,55,89

	public static void main(String[] args) {
	int fib_se,tem;
	int a =0,b=1;
	Scanner fi=new Scanner(System.in);
	System.out.println("Enter number");
	fib_se=fi.nextInt();
	System.out.print(a+" ");//0
	System.out.print(b);//1
	for(int i=1;i<=fib_se;i++) {//10
		tem=a+b;// 1 , 2 , 3 , 5 , 8 , 13
		a=b;//a=1 , 1 , 2 ,3 , 5
		b=tem;//b=1 ,2 ,3 , 5 , 8
		System.out.print(" "+tem);
	}
	}

}
