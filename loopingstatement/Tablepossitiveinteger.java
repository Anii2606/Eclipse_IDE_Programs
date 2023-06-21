package com.loopingstatement;

import java.util.Scanner;

public class Tablepossitiveinteger {

	public static void main(String[] args) {
		int posstiveint;
		Scanner s=new Scanner(System.in);
		System.out.println("Typ posstive interger");
		posstiveint=s.nextInt();
		System.out.println("multiplication of: " +posstiveint);
		for(int i=1 ;i<=10;i++) 
		{
		System.out.println(posstiveint +" * " +i +" = " + (posstiveint*i));
		}
		
	}

}
