//got the avrage of 5 number 
package com.Loop;

import java.util.Scanner;

public class Avg {
public static void main(String[] args) {
	int num,sum=0;
Scanner sc=new Scanner(System.in);
//enter number for take avarage of number

//when counter value is <5 it is execute
for(int count=0;count<5;count++){
	System.out.println("Enter number ");
	num=sc.nextInt();

	sum=sum+num;//1 num =10 2.num=20 3. =10 4.=5 5.=5
}
System.out.println("sum is :"+sum);
int avg=sum/5;
System.out.println("Avarage is :"+avg);
}


}
