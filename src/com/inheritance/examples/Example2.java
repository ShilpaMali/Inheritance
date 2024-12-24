package com.inheritance.examples;

public class Example2 {
	public static void main(String[] args) {

		// Scenario-2
		Y y = new Y();
		//y is eligible to call all variable and method of class Y
		System.out.println(y.a); //10
		System.out.println(y.b); //30
		System.out.println(y.c); //40
		y.x1(); //Class X:: x1() method
		y.x2(); //Class Y:: x2() method
		y.x3(); //Class Y:: x3() method
	}

}
