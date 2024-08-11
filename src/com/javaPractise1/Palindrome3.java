package com.javaPractise1;
import java.util.*;
public class Palindrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString a="Madam";
		String a;
		String c="";
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		String b=a.toLowerCase();	
		System.out.println("Enter a string to check if ots palindrome or not:");
	
	  for(int i=0;i<b.length();i++)
	  { c=b.charAt(i)+c; 
	  } 
	  System.out.println("Reversed string"+c);
	  if(c.toLowerCase().equals(b)) {
		  System.out.println("Is a palindrome"); 
		  } else
	  {
			  System.out.println("Is not a palindrome");
			  }
	 

	}

}
