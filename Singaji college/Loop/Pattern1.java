package com.Loop;
//  * * * * * * * 	7
//  * * * * * * 	6
//  * * * * *		5
//  * * * *			4
//  * * *			3
//  * *				2
//  *				1
public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=7;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.print("\n");
			//System.out.println();
		}

	}

}
