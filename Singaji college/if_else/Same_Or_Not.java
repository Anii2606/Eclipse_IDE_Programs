package com.if_else;

import java.util.Scanner;

public class Same_Or_Not {

	public static void main(String[] args){
		float num1;
		float num2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first float number");
		num1=s.nextFloat();
		System.out.println("Enter second float number");
		num2=s.nextFloat();
		
		if(num1==num2) {
			System.out.println("They are same ");
		}else {
			System.out.println("They are different");
		}
	}

}
