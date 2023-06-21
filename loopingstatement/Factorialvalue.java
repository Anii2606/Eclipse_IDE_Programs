package com.loopingstatement;

import java.util.Scanner;

public class Factorialvalue {

	public static void main(String[] args) {
int num;
int fact=1;
Scanner f=new Scanner(System.in);
System.out.println("Enter one number");
num=f.nextInt();
System.out.println("Enter number multiplication: "+num );
for(int i=1;i<=num;i++) //n=1 ,n=2 ,n=3,n=4,n=5
{
fact*=i;//  fact value is 1, 2, 6, 24 ,120
}

System.out.println("Total factorial"+" = "  + fact);

	}

}
