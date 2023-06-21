package com.datatype;

import java.util.Scanner;

public class Convert_Inch_meter {

	public static void main(String[] args) {
Scanner ci=new Scanner(System.in);
System.out.println("Enter any inch typ value for convert to meters");
double inch;
inch=ci.nextDouble();
double meter=0.0254;
meter*=inch;
System.out.println(inch+" inch"+" is equal to "+meter+" meters");
	}

}
