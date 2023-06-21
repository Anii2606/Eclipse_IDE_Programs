// three int values from user and print greatest among them.
package com.if_else;

import java.util.Scanner;

public class G_M_S_Between_three_number {

	public static void main(String[] args) {
		int a, b, c;
		Scanner d = new Scanner(System.in);
		System.out.println("Enter Three Int Value");
		System.out.println("first :");
		a = d.nextInt();
		System.out.println("second :");
		b = d.nextInt();
		System.out.println("Third :");
		c = d.nextInt();
// for Greater value
		if (a > b) {
			if (a > c) {
				System.out.println("greatest is first :" + a);
			} else {
				System.out.println("greatest is third :" + c);
			}
		} else {
			if (b > c) {
				System.out.println("greatest is second :" + b);

			} else {
				System.out.println("greatest is third :" + c);
			}

		}
// for middle
		 int middleNumber = getMiddleNumber(a, b, c);
	     System.out.println("The middle number is: " + middleNumber);
		// for smallest
		if (a < b) {
			if (a < c) {
				System.out.println("smallest first is :" + a);
			} else {
				System.out.println("smallest third is :" + c);
			}
		} else {
			if (b < c) {
				System.out.println("smallest second is :" + b);

			} else {
				System.out.println("smallest third is :" + c);

			}
			
		}
	}
			 public static int getMiddleNumber(int a, int b, int c) {
			        // Compare the three numbers and find the middle one
			        if ((a >= b && a <= c) || (a >= c && a <= b)) {
			            return a;
			        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
			            return b;
			        } else {
			            return c;
			        }
	

}
	}
	
	