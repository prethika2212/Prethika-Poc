package com.javaPractise1;

import java.util.Scanner;

public class Checkingvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String word=input.toLowerCase();
		String vowels[]= {"a","e","i","o","u"};
		String a=vowels.toString();
		if(word.contains(a)) {
			System.out.println("Contains vowels");
		}
		
		else
		{
			System.out.println("Doesn't Contain vowels");
		}
	}

}
