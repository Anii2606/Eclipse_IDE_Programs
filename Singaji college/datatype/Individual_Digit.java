package com.datatype;

import java.util.Scanner;

public class Individual_Digit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter number");
		int num=s.nextInt();
		String mystring=String.valueOf(num);
		int length=mystring.length();
for (int i=1;i<=length;i++) {
	System.out.print(i);
	System.out.print(" ");
}

	}
	

}
