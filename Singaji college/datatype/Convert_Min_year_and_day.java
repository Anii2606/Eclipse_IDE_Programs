package com.datatype;

import java.util.Scanner;

public class Convert_Min_year_and_day {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long min;
		System.out.println("Enter minutes");
		min =s.nextLong();
		long  year;
		long day;
		year=365*24*60;
		long month=60*24*30;
		day=24*60;
		System.out.println(min+" Minutes in year "+min/year+" year and  "+min/month%365+" month "+" and "+min/day%30+" days");
	
		//output is =3456000
		

	}

}
