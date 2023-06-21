/*Suppose the values of variables 'a' and 'b' are 6 and 8 
respectively, write 
 * two programs to swap the values of the two variables.
1 - first program by using a third variable
2 - second program without using any third variable
( Swapping means interchanging the values of the two variables
 E.g.- If entered value of x is 5 and y is 10 then after swapping the value
 of x and y should become 10 and 5 respectively.)*/

package com.basic;

import java.util.Scanner;

public class SwappingValue { 
public static void main(String []args) {
	int a;//4
	int b;//3
	Scanner cs =new Scanner(System.in);
	System.out.println ("Enter number");
	a=cs.nextInt();
	System.out.println ("Enter number");	
	b=cs.nextInt();
//	int c;
//	c=a;//c=4
//	a=b;//a=3
//	b=c;//b=4
	b=b-a;//b=-1
	a=b+a;//a=3
	b=-(b-a);//b=4
		System.out.println("After Swipping the value is :" + a +"\n"+ b);
	}

}
