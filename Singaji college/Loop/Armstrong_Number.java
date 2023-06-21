package com.Loop;

public class Armstrong_Number {//1= 1^1 , 2= 1^2,2^2 , 3= 1^3,2^3,3^3
public static void main(String[] args) {
	
		int n=153;
		int	n1=n,length=0;
		System.out.println(n1);
		
while(n1!=0)	
	//num2=153!=0(execute)statement than num2=153/10=15
	//if condition is true its run continueslly again and again
{
	n1=n1/10;
	length=length+1; // first=1 ,second=2 ,third=3 = 3	
}
System.out.println(length);

int rem=0;
int arm=0;
int n2 =n;
System.out.println(n2);

while(n2!=0) 
{
rem=n2%10;// 3, 5 ,1
int mul=1;
for(int i=1;i<=length;i++) {//3
		mul=mul*rem;//1*3=3*3=9*3=27, 125 ,1 
		System.out.println(mul);
	}
	arm=arm+mul;//27+125=152+1=153
	n2=n2/10;//15 , 1 ,0 out to loop;
}
if(n==arm) {
	System.out.println(n+" is Armstrong Number");
	}else 
	{	
		System.out.println(n+ " is not Armstrong Number");
	}

	}
}