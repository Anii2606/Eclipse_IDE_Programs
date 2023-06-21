//A shop will give discount of 10% if the cost of purchased quantity
//is more than 1000.Ask user for quantity one unit will cost 100.
//Judge and print total cost for user.
package com.if_else;

import java.util.Scanner;

public class P_1 {
public static void main(String[] args) {
	float dis, quan,per_unit;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the quantity of unit");
	quan=s.nextInt();
	per_unit =100.0f;
	System.out.println("your Bill is "+quan*per_unit);
	dis=0.1f;
//float t=(quan*per_unit)/dis;//1000*10/100
	if (quan*per_unit>=1000) {
		System.out.println("congratulation\n"+"You got 10% discount");
		System.out.println("your discount is :"+((quan*per_unit)*dis));
		System.out.println("After discount your bill is :"+((quan*per_unit)-(quan*per_unit)*dis));
	}else {
		System.out.println("SORRY your cost is under the 1000 rupee\nNO DISCOUNT");
	}
}
}
