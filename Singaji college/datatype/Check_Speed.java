package com.datatype;

import java.util.Scanner;

public class Check_Speed {

	public static void main(String[] args) {
	double dis,speed,hour,minute,second,miles;
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter Distance in meters");
	dis=ob.nextInt();//2500
	//speed=distance(in KM)/Time(in hour)
	System.out.println("Enter hour");
	hour=ob.nextInt();
	System.out.println("Enter minute");
	minute=ob.nextInt();
	System.out.println("Enter second");
	second=ob.nextInt();
	double time =(hour*3600)+(minute*60)+(second);
	// 1609 in meters or 1.609 km
	miles=1.609;// km*0.609 or 1609 meters
	speed=dis/time;
	System.out.println("Your speed in meter/second is :"+speed);
	
	double speed2=(dis/1000)/(time/3600);
	System.out.println("Your speed in kilometer/hour is :"+speed2);
	
	double speed3=(dis/1609)/(time/3600);
	System.out.println("Your speed in miles/hour is :"+speed3);
	
	
	}

}
