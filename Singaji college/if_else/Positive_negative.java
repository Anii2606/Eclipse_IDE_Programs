package com.if_else;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
	int number;
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter any integer number");
	number=ob.nextInt();
	if(number>0) {
	System.out.println("Number "+number+" is positive ");	
	} 
	//else if(number<0){
	//System.out.println("Number "+number+" is nagative ");	//}
	else {
		if(number==0) {
		System.out.println("Number "+number+" is zero ");	
		}else {
	System.out.println("Number "+number+" is nagative ");
	}
	}
}
}
