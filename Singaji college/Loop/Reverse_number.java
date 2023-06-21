package com.Loop;

import java.util.Scanner;

public class Reverse_number {

	 public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sd=new Scanner(System.in);
		int num,rem,rev=0;//5,4,3,2,1
		num=sd.nextInt();
		int number =num;
		//String myString=String.valueOf(number);
		//int length=myString.length();
		for(int i =1;i<=number;i++) //{//number =12345,1234,123,12,1
		//while(number!=0) 
		{	
			rem=number%10;//modu=12345%10=5,4,3,2,1
			rev=rev*10+rem;//rev =0*10+5=50+4,540+3,5430+2,54320+1
			number/=10;//12345/10=1234,123,12,1
		}
		System.out.println(num+" of Reverse is :"+rev);
	}
	 // (rev*=10)==rev=rev*10
	 //rev+=10==rev=rev+10
}
