package com.javaPractise1;

public class SwappingNumbers2 {

	public static void main(String args[]) {
		int a=-5;
		int b=-4;
		a = a + b;
		b = a - b;
		a = a - b;

	    System.out.println("After swapping, a is " + a + " and b is " + b);
		
	}
}
