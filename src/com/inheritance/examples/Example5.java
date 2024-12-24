package com.inheritance.examples;

public class Example5 {
	public static void main(String[] args) {

		// Scenario-4
		X x = new Y();
		Y y = new Y();
		y=(Y) x;  //type casting
		System.out.println(y.a); // 10
		System.out.println(y.b); // 30
		System.out.println(y.c); // 40
		y.x1(); // Class X:: x1() method
		y.x2(); // Class Y:: x2() method
		y.x3(); // Class Y:: x3() method
	}

}
