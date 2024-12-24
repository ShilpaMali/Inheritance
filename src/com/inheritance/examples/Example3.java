package com.inheritance.examples;

public class Example3 {
	public static void main(String[] args) {

		// Scenario-3
		X x = new Y(); //dynamic dispatch
		System.out.println(x.a); //10
		System.out.println(x.b); //20
		//System.out.println(x.c); //No output
		x.x1(); //Class X:: x1() method
		x.x2(); //Class X:: x2() method
		//compile time - class X- X2() method
		//run time - class Y- x2() method
		//x.x3(); //No output
	}

}
