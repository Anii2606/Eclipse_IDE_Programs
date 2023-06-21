package com.Loop;

import java.util.Scanner;

public class Prime_num_Between_of {

	public static void main(String[] args) {
	int num,tem=0;
	int num1;
	Scanner d=new Scanner(System.in);
	System.out.println("Enter number last number howlong you want");
	num1=d.nextInt();//100
	for(num=1;num<=num1;num++) //100
	{
		for(int j=2;j<num;j++) {
			if(num%j==0) {
				tem=tem+1;
			}
		}
		if(tem==0){
			System.out.println(num);
		}else {
		tem=0;
		}
	}
	
	System.out.println("This number is Prime_number");
	
	}

}
