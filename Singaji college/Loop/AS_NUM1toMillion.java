package com.Loop;

import java.util.Scanner;

public class AS_NUM1toMillion {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);			
		System.out.println("Enter number for armstrong check");	
		int num=d.nextInt();
					for(int	n=0;n<=num;n++){
						int n2=n;
						int n3=n;
						int arm=0;
						int rem=1;
						int length=0;		
			while(n2!=0){
						n2=n2/10;
						length=length+1;		
			}
			while(n3!=0) 
			{
			rem=n3%10;
			int mul=1;
			for(int i=1;i<=length;i++) {
					mul=mul*rem; 
					//System.out.println(mul);
				}
				arm=arm+mul;
				n3=n3/10;
			}
			if(n==arm) {
				System.out.println(n+" is Armstrong Number");
				}
			//else {
					//System.out.println(n+" is not Armstrong number");
			//	}
					}


	}

}
