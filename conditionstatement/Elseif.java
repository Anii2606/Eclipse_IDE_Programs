package com.conditionstatement;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		int x,y,z;
	Scanner m=new Scanner(System.in);
	System.out.println("Enter first number: ");
	x=m.nextInt();
	System.out.println("Enter second number: ");
	y=m.nextInt();
	System.out.println("Enter third number: ");
	z=m.nextInt();
	
	if(x>y)
	{
		System.out.println("the x is bigger than the y ");
	}
	else if(y>z)
	{
		System.out.println("the y is bigger than the z ");
	}
	else if(z>x)
	{
		System.out.println("the z is bigger than the x  ");
	} else
	{
		System.out.println(" wrong input ");
	}
	}

}
