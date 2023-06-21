package anii;

import java.util.Scanner;
public class Revers{
public static void main(String[] args){
int num;
int rever=0;
Scanner r=new Scanner(System.in);
System.out.println("Enter any positive number");
num =r.nextInt();
int temp=num;
int remaider=0;
while(num>0){
	remaider=temp%10;
	rever=rever*10+remaider;
	temp=temp/10;	
	
}
System.out.print("Revers value is :"+rever);
}
}