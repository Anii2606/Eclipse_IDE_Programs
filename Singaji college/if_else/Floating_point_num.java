package com.if_else;

import java.util.Scanner;

public class Floating_point_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num;
		System.out.println("Enter any floating_point_number");
		num = sc.nextFloat();
		if (num > 1) {
			System.out.println("Number " + num + " is positive");
			if (num > 1000000) {
				System.out.println("number " + num + " is large  posstive number");
			}

		} else if (num < 0) {
			System.out.println("number " + num + " is Nagative number ");
		} else if (num > 0 && num < 1) {
			System.out.println("number " + num + " is posstive smallest number");
		} else {
			System.out.println("number is zero");
		}
	}
}