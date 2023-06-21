package com.anikesh;

import java.util.Scanner;

public class Aayatakar {

	public static void main(String[] args) {
	int L,B;
	Scanner lb=new Scanner(System.in);
	System.out.println("Enter lenth:  ");
	L=lb.nextInt();
	System.out.println("Enter breadth:  ");
	B = lb.nextInt();
	if(L==B)
	{
		System.out.println("square");
	}
	else 
	{
		System.out.println("rectangle");
	}
	}

}
