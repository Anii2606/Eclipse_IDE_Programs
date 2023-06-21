package com.arr;

class SwitchTest {

	public static void main(String s[]) {

		SwitchTest ref1 = new SwitchTest(10);

		SwitchTest ref2;

	ref2 = ref1.inc();

	System.out.println(ref1.a);

	System.out.println(ref2.a);

	ref2 = ref1.inc();

	System.out.println(ref2.a);

	}

	}


public class SwitchTest {
	int a;


	SwitchTest(int i) {

	a = i;

	}

	SwitchTest inc( ) {

		SwitchTest temp = new SwitchTest(a+10);

	return temp;

	}

	}

	
	
		