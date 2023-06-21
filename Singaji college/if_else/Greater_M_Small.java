package com.if_else;
import java.util.Scanner;

public class Greater_M_Small {
public static void main (String []args){
Scanner sc = new Scanner(System.in);
int a;
int b;
int c;
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
System.out.println("Enter third number");
c=sc.nextInt();
int greater;
if(a>b){
	if(a>c){
	greater=a;	
	}else{
		greater=c;
	}
}else{
	if(b>c){
	greater=b;
	
	}else{
		greater=c;
	}
}
int smallest;
if(a<b){//b>
if(a<c){//c>
	smallest=a;
}else{
	smallest=c;
}
}else{
	if(b<c){
	smallest=b;
	}else{
		smallest=c;
	}
}
//int middle=a+b+c-greater-smallest;
int middle=getMiddle(a,b,c);
System.out.println("Greater number is "+greater);
System.out.println("middle number is "+middle);
System.out.println("smallest number is "+smallest);
}
public static int getMiddle(int a,int b,int c) {
	if(a<=b&&a>=c||a<=c&&a>=b) {
		return a;
	}else if (b>=a&&b<=c||b<=a&&b>=c) {
		return b;
	}else {
		return c;
	}
	
}
}