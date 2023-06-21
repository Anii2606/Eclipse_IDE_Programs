package com.Loop;

import java.util.Scanner;

public class Fibo_Se_By_Recursion {
static int a=0,b=1,d,c;
public static void main(String[] args) {
Scanner fib=new Scanner(System.in);
Fibo_Se_By_Recursion se=new Fibo_Se_By_Recursion();
	
System.out.println("Enter number");
c=fib.nextInt();
System.out.println(a);
System.out.println(b);
se.method2(c);
}
public int method2( int c) {
if(c>=1) {
	d=a+b;
	a=b;
	b=d;
	System.out.println(d);
	method2(c-1);
}
return d;
}

}
