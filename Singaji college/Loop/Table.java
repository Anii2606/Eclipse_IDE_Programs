package com.Loop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		System.out.println("Enter number for table");
		int num;
		Scanner S = new Scanner(System.in);
		num=S.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
