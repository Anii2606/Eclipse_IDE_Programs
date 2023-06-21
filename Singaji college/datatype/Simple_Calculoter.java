package com.datatype;

import java.util.Scanner;

public class Simple_Calculoter {

	public static void main(String[] args) { 
		float num1;
		float num2;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=ob.nextFloat();
		System.out.println("Enter Second Number");
		num2=ob.nextFloat();
		float sum=num1+num2;
		float differece=num1-num2;
		float product=num1*num2;
		float average=(num1+num2)/2;
		//remmaber : distance is always possitive 
		//int distance=Math.abs(num1-num2);
		System.out.println("sum of two integer :"+sum);
		System.out.println("diffence of two integer : "+differece);
		System.out.println("product of two integer : "+product);
		System.out.println("average of two integer : "+average);
		float distance;
		if(num1>=num2) {
			distance=num1-num2;
		}else {
			distance=num2-num1;
		}
		////////OR//////
		//if(num1>=num2) {
		//System.out.println("Distance is "+(num1-num2));
		//}else {
		//	System.out.println("Distance is "+ (num2-num1));	
		//}
		System.out.println("distance of two integer :"+distance);
		if(num1>num2) {
			System.out.println("Maximum of two integer :"+num1);
			System.out.println("minimum of two integer : "+num2);
			} else {
				System.out.println("Maximum of two integer :"+num2);
				System.out.println("minimum of two integer : "+num1);
	

		
		
	}

}
	}
