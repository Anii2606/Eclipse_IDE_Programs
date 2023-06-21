package com.datatype;

import java.util.Scanner;

public class Add_Digit {

	public static void main(String[] args) {
		int num;
		int sum=0;
		//int digit=0;
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter any number among 0 to 1000");
		num=ad.nextInt();
		//String mystring=String.valueOf(num);
		//int length=mystring.length();//4
		//for(int i =0;i<length;i++) {
		//if (num<1000&&num>0) {
		//digit=num%10;//if number is 123 First_digit= 3	
//}
		int First_digit=num%10;//if number is 123 First_digit= 3
		int First_divide=num/10;//First_divide=12
		int second_digit=First_divide%10;//second_digit=2
		int second_divide=First_divide/10;//second_divide=1
		int third_digit=second_divide%10;//third_digit =1
		
		//}
		//sum+=digit;
		System.out.println("number of "+num +" of sum is "+First_digit+second_digit+third_digit);
	}

}
