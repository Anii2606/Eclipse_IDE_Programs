package com.Loop;

import java.util.Scanner;

public class Palindrome_Number {
public static void main(String[] args) {
	System.out.println("Enter any Palindrome  number");
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	int n1=n,n2;
	//int n=121;// This Palindrome number because right to left and left to right this is same 
	int tem =0;
	
	for(;n1!=0;n1=n1/10) {//121 , 12
		n2=n1%10;//n=1 , 2
		tem=(tem*10)+n2;//0*10+1=1 , 1*10+2=12
	}
	System.out.println(n);
	System.out.println(tem);
	if (n==tem) {
		System.out.println(n+" is palindrome number");
	}else {
		System.out.println("This is not palindrome number");
	}
	
}
}
// for want to length of integer number
//String mystring=String.valueOf(n);
	//int l=mystring.length();