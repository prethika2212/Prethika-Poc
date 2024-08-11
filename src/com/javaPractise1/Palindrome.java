package com.javaPractise1;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Madam";
		String b=a.toLowerCase();
		String c="";
	
		
		for(int i=0;i<b.length();i++) {
			c=b.charAt(i)+c;
		}
		System.out.println(c);
		if(c.toLowerCase().equals(b)) {
			System.out.println("Is a palindrome");
		}
		else {
			System.out.println("Is not a palindrome");
		}
	}
}

