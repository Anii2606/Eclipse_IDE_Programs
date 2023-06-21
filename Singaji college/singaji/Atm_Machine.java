package com.singaji;
import java.util.Scanner;

public class Atm_Machine {
static int demo_pin=1234;
static int demo_card=12345678;
static int money=5000;
	public static void main(String[] args) {
		int pin_number; 
		int card_number;
		Scanner at=new Scanner(System.in);
		System.out.println("Enter your pin number");
		pin_number=at.nextInt();
		System.out.println("Enter your card number");
		card_number=at.nextInt();
			if(money==0);
			System.out.println("Invalid");
	char i;
	
	do {		
		if(demo_card==card_number&&demo_pin==pin_number) {
			System.out.println("what do you want ,choose any number");
			System.out.println("deposite for (1) ");
			System.out.println("withdraw for (2) ");
			System.out.println("check money for (3) ");
			//deposite money,withdraw money,check money
			int a=at.nextInt();
			switch(a) {
			case 1: 
					System.out.println("Enter your money");
					int d= at.nextInt();
					System.out.println("you deposit "+d+" successful");
					System.out.println("your account balance is :" + (money+d));
					money+=d;
					break;
					
					
			case 2: 
				System.out.println("Enter your money");
				int w= at.nextInt();
				System.out.println("you withdraw "+w+" successful");
				System.out.println("your account balance is :" + (money-w));
				money-=w;
				break;
				
			case 3:
					System.out.println("remaining balance");
					System.out.println("your balance is :"+money);
				break;
				
			default :
				System.out.println("Wrong input");
				break;
			}
			
			
			
		}else {
			System.out.println("Wrong Password");
		}
		System.out.println("If you want continue than typ Y and or not N");
		i=at.next().charAt(0);
	
	}
	while(i=='y'||i=='Y');
	
	
	}
	

}