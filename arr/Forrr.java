package com.arr;//    Forrr

class Forrr {

public static void main(String args[]) {

int a = 9;

Forrr t = new Forrr();

t.doMethod(a);

System.out.print(" main() a = " + a);

}

void doMethod(int a) {

System.out.print(" doMethod() a = " + a++);

}

}