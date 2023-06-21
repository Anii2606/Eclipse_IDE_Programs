package com.anikesh;

public class Datatype {
	
int a=22;//instance variable
static double b=87.9;// static variable

	public static void main(String[] args) {
	String c = "anikesh";
	boolean d=true;//local variable
	
	Datatype p=new Datatype() ;
	
	//System.out.println( p.a+" "+b+" "+c); //first option
	
	
	//System.out.println("p.a");
	//System.out.println("b");
	//System.out.println("c");
	//wrong , because ("")is wrong and output is (s.a, b, c)
	
	
	System.out.println(p.a);// second option
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	// that is right because output is right (22, 87.9, true)
	}

}
