package com.javaPractise1;

public class PrintRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i=n;i>=1;i--) {
			for(int j=n;j<=i;j--) {
				System.out.println("*");
			}
		System.out.println("");
		}
	}

}