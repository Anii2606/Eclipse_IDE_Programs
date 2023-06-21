package com.datatype;

import java.util.Scanner;

public class PowerCalculoter {

	public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	double number;
	System.out.println("Enter any number");
	number=d.nextInt();
	double square=Math.pow(number, 2);
	double cube=Math.pow(number, 3);
	double fourth=Math.pow(number, 4);
	System.out.println("Square "+square );
	System.out.println("cube "+cube);
	System.out.println("fourth "+fourth);

	
	
	}

}
