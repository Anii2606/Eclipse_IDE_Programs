package com.loopingstatement;

import java.util.Scanner;

public class WhileLoop {
public static void main(String []args) {
	System.out.println("Enter number");
int num;
Scanner d =new Scanner(System.in);
num=d.nextInt();
while(num>=0) {
	if(num%2==0)
			
		{
			System.out.println("Even number");
		break;
		}
		else {
			System.out.println("odd number");
break;
		}

}

} 
}
