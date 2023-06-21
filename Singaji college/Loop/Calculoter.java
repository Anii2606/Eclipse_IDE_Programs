package com.Loop;

import java.util.Scanner;

// By switch case
public class Calculoter {

	public static void main(String[] args) {
		String yn;
		
		do {
		Scanner cal = new Scanner(System.in);
		System.out.println("Enter number 1");
		float n1 = cal.nextFloat();
		System.out.println("Enter number 2");
		float n2 = cal.nextFloat();
		System.out.println("Enter any : + , - , * , / ");
		char sym;
		sym = cal.next().charAt(0);
		switch (sym) {
		case '+':
			float ad = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + ad);
			break;

		case '-':
			float sub = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + sub);
			break;

		case '*':
			float mul = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + mul);
			break;

		case '/':
			float div = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + div);

			break;

		case '%':
			float modu = n1 % n2;
			System.out.println(n1 + " % " + n2 + " = " + modu);
			break;
			
		default:
			System.out.println("Wrong input");
			break;
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("If you want to continue (press Yes and No)");
		yn=cal.next();
	}while(yn.equals("yes")||yn.equals("Yes"));

}
}
