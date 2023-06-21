package com.conditionstatement;

public class NestedIfElse {

	public static void main(String[] args) {
	int a=100,n=60,i=25;
	
if(a>n) 
{
	if(a>i) 
	{
		System.out.println("maximum number" +a);
	}else 
	{
		System.out.println("maximum number" +i);
	}
}else 
{
if(n<i) 
{
	System.out.println("maximum number" +i);	
}else 
{
	System.out.println("maximum number" +n);
}	
}

	}

}
