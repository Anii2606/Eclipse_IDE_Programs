package com.datatype;

import java.util.Scanner;

public class Add_digit_while {
public static void main(String[] args) {
	System.out.println("Enter any number");
	Scanner sc =new Scanner(System.in );
	long number;
	number=sc.nextLong();
	int sum=0;
	long number_2=number;
	while(number_2!=0) {
		long digit=number_2%10;
		sum+=digit;
		number_2/=10;
	}
	System.out.println("number of "+number+" all digit sum is "+sum);
}
}
