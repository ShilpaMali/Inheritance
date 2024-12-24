package com.inheritance.examples;

public class Example4 {
	public static void main(String[] args) {

		// Scenario-4
		X x = new X();
		Y y = new Y();
		x=y;
		System.out.println(x.a); // 10
		System.out.println(x.b); // 20
		//System.out.println(x.c); //No output
		x.x1(); // Class X:: x1() method
		x.x2(); // Class Y:: x2() method
		//x.x3(); //No output
	}

}
