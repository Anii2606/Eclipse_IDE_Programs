package com.if_else;

import java.util.Scanner;

public class Month_Days {

public static void main(String[] args) {
	Scanner m=new Scanner(System.in);
	System.out.println("Enter any month number");
	int month,year;
	String month_name=" ";
	int number_of_days=0;
	month=m.nextInt();
	System.out.println("Enter any year");
	year=m.nextInt();
	switch(month) {
	case 1:
		month_name="january";
		number_of_days=31;
		break;
	case 2:
		month_name="february";
		if (year%400==0||(year%4==0&&year%100!=0)){
		number_of_days=29;	
		}else {
			number_of_days=28;	
		}
		break;
	case 3:
		month_name="march";
		number_of_days=31;
		break;
	case 4:
		month_name="april";
		number_of_days=30;
		break;
	case 5:
		month_name="may";
		number_of_days=31;
		break;
	case 6:
		month_name="june";
		number_of_days=30;
		break;
	case 7:
		month_name="july";
		number_of_days=31;
		break;
	case 8:
		month_name="august";
		number_of_days=31;
		break;
	case 9:
		month_name="septmber";
		number_of_days=30;
		break;
	case 10:
		month_name="october";
		number_of_days=31;
		break;
	case 11:
			month_name="november";
			number_of_days=30;
			break;
	case 12:
		month_name="december";
		number_of_days=31;
		break;
	default :
		System.out.println("Invalid");
		break;
	
	}
    System.out.print(month_name+ " " + year + " has " + number_of_days+ " days\n");

	}

}
