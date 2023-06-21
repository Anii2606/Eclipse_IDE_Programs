package com.Loop;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
	 String name;
	 String save=" ";
	 Scanner S = new Scanner(System.in);
	 System.out.println("Enter your name ");
	 name=S.nextLine();
	 int length=name.length();//6
	 for (int i=length-1;i>=0;i--) {//loop run i=5 so 5>=0
		 save=save+name.charAt(i);//i=5=h,s,e,k,i,n,A
	 }
	 System.out.println(name+" name reverse is"+save);
	}

}
