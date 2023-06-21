package com.datatype;

import java.util.Scanner;

public class Add_digit_for {

	public static void main(String[] args) {
		int num;
		int sum=0;
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter any number ");
		num=ad.nextInt();
		int take=Math.abs(num);
		//String mystring=String.valueOf(num);
		//int length=mystring.length();//4
		for(int r= take%10;take>0;take=take/10,r=take%10) {
		
		sum+=r; //
		
		}
		System.out.println("The sum of the all digit "+num+" is "+sum);
	}

}

