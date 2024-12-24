package com.inheritance.examples;

public class Example1 {
	public static void main(String[] args) {

		// Scenario-1
		X x = new X();
		//x is eligible to call all variable and method of class X
		System.out.println(x.a); //10
		System.out.println(x.b); //20
		//System.out.println(x.c); //40
		x.x1(); //Class X:: x1() method
		x.x2(); //Class X:: x2() method
		//x.x3(); //Class Y:: x3() method
	}

}
