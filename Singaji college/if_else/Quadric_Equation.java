package com.if_else;

import java.util.Scanner;

public class Quadric_Equation {

	public static void main(String[] args) {
	Scanner q=new Scanner(System.in);
	System.out.println("Enter value of a ");
	double a;
	a=q.nextDouble();
	System.out.println("Enter value of b ");
	double b;
	b=q.nextDouble();
	System.out.println("Enter value of c ");
	double c;
	c=q.nextDouble();
	double result=Math.pow(b, 2)-4.0*a*c;

if(result>0) {
	double root1=(-b+Math.pow(result, 0.5))/(2.0*a);
	double root2=(-b-Math.pow(result, 0.5))/(2.0*a);
	System.out.println("There are two roots first is "+root1+" And second "+root2);
	
}else if(result==0) {
	 double root1=-b/2.0*a;
	 System.out.println("There is only one root "+root1);
	}
else {
	System.out.println("This is not a valid value");
}
	}

}
