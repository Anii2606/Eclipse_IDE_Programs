
package com.datatype;

import java.util.Scanner;

public class Convet_T_F_C {

	public static void main(String[] args) {
Scanner ca=new Scanner(System.in);
System.out.println("Enter any fahranheit value for convert to celcius");
float fahr;
fahr=ca.nextFloat();
float cal,kal;
cal=5*(fahr-32)/9;
kal=cal+273.15f;
System.out.println(fahr+" digree fahranheit is equal to "+cal+" celsius");
System.out.println(cal+" digree celsius is equal to "+kal+" kalvin");




	}

}
