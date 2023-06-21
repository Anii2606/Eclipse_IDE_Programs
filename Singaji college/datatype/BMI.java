package com.datatype;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
	double weight;
	double height;
	Scanner bm=new Scanner(System.in);
	System.out.println("Enter your weight");
	weight=bm.nextDouble();
	System.out.println("Enter your height");
	height=bm.nextDouble();
	//meter= 39.37 inch;
	//kilog= 2.2046 pound;
	//BMI = weight (in kilograms) / (height (in meters))²;
	double BMI2 = weight / Math.pow(height,2);//(heigth*height)
	System.out.println("Body Mass Index is "+BMI2+"in kg/meter");
	// if inch*inch
	//BMI = (weight (in pounds) / (height (in inches))²) * 703
	double BMI=(weight / (height*height)) * 703.073;
	System.out.println("Body Mass Index is "+BMI+"in pound/inch");
	
	
	
	
}
}