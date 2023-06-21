//Take input of age of 3 people by user and determine oldest and youngest among them.

package com.if_else;
import java.util.Scanner;

public class P_older2 {

	public static void main(String[] args) {
		
		int first_age;
		int second_age;
		int third_age;
	
	Scanner d=new Scanner(System.in);
	
		System.out.println("Enter any people age's");
	
		System.out.println("first people age");
		first_age=d.nextInt();
		
		System.out.println("second people age");
		second_age=d.nextInt();
		
		System.out.println("third people age");
		third_age=d.nextInt();
		
	if (first_age>second_age) {
		
		if (first_age>third_age) 
				System.out.println("oldest is :"+first_age);
			if (third_age>second_age) 
				System.out.println("youngest is :"+second_age);
			   else 
				System.out.println("youngest is :"+third_age);
		
if (second_age>first_age) 
	
	if(second_age>third_age) 
				System.out.println("oldest is :"+second_age);
		if(first_age>third_age) 
				System.out.println("youngest is :"+third_age);
			else 
				System.out.println("youngest is :"+first_age);
		}
			
else {
					
	if (third_age>first_age&&third_age>second_age) 
				System.out.println("oldest is :"+third_age);
		if(second_age>first_age)	
				System.out.println("youngest is :"+first_age);
			else {
				System.out.println("yougest is :"+second_age);
					}
				}
			}	
			
}
			
		
	
