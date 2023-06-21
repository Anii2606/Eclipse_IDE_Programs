package com.arr;

public class TestClass2 {

		public static void main(String[] args) {

		Sub objSub = new Sub(" Inc");

		}

		}

		class Base {

		Base() { //2

		this("Kogent ", "Solution");

		}

		Base(String s, String t) { //3

		this(s + t);

		}

		Base(String s) { //4

		System.out.print(s);

		}

		}

		class Sub extends Base {

		Sub(String s) { //1

		System.out.print(s);

		}

		Sub(String s, String t) {

		this(t + s + "1");

		}

		Sub() {

		super("2");

		};

		}


