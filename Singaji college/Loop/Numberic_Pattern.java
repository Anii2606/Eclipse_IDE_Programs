// package for the class
package com.Loop;

/*public-access modifier
  class- keyword
  Numberic_Pattern-class name(Identifier)*/
public class Numberic_Pattern {

	/*static-keyword
	void-void type keyword
	main -method
	String -class
	[]-Array symbol
	args - argument(Array name )*/
	public static void main(String[] args)
	/* 1 line
	 3 line
	 5 line */
	{ for(int i=1;i<=5;i=i+2) {
		
			int m=0;
			
			//1- 5 4 3 2 1
			//3- 5 4 3
			//5- 5
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
				m++;		
		}
			//2- 1 2 3 4 
			//4- 1 2
			System.out.println();
			for(int k=1;k<=m-1;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}


	}

}
