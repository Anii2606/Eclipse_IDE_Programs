package com.conditionstatement;

import java.util.Scanner;

public class Greatestvalue {

	public static void main(String[] args) {
int a,b;
Scanner u=new Scanner(System.in);
System.out.println("Enter first number:  ");
a=u.nextInt();
System.out.println("Enter second number:  ");
b=u.nextInt();
if(a>b) 
{
	System.out.println("a is greater than b");
}
else if(a<b)
{
	System.out.println("b is greater than a");
}
else
{
		System.out.println("a is eqale of b");
	
}


	}

}
