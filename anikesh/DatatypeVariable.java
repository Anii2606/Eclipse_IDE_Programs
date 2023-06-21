package com.anikesh;;

public class DatatypeVariable {

	//String name="Ram"; // instance variable
	static int a = 25;
	static double marks =87.8;//static variable
	public static void main(String[] args) {
		String name="Ram";
		//int age = 25;
		char gender ='M';
		boolean ans= true;
		
		DatatypeVariable sd=new DatatypeVariable();
		System.out.println(name+" "+sd.a+" "+gender+" "+marks+" "+ans );// first method
	
		
		//System.out.println(name);// second method
		//System.out.println(sd.a);
		//System.out.println(gender);
		//System.out.println(marks);
		//System.out.println(ans);

	}
	
	
}
