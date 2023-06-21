package com.basic;

import java.util.Scanner;

public class Scan{
static int a;
double b;
public static void main(String[] args){
boolean c=true;
Scanner sc =new Scanner(System.in);
System.out.println("Enter a,b & c ");
a = sc.nextInt();
System.out.println("Mathametic marks :"+ a);
Double b=sc.nextDouble();
System.out.println("Physics marks" +  b);
c = sc.nextBoolean();
System.out.println(c);
}
}
